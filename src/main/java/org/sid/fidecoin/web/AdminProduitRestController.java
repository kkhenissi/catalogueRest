package org.sid.fidecoin.web;


import org.apache.commons.io.IOUtils;
import org.sid.fidecoin.daos.CategorieRepository;
import org.sid.fidecoin.daos.ProduitRepository;
import org.sid.fidecoin.entities.Categorie;
import org.sid.fidecoin.entities.Produit;
import org.sid.fidecoin.metiers.IAdminCategorieMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/adminProd")
@CrossOrigin(origins = "*")
public class AdminProduitRestController {
    @Autowired
    private ProduitRepository produitRepository;


    @Autowired
    private IAdminCategorieMetier metier;


    @PostMapping("")
    public Produit saveProduit(@RequestBody Produit prd,
                                   MultipartFile file) throws IOException {

        String path=System.getProperty("java.io.tmpdir");
        prd.setUrlPhoto(path);
        Produit p = produitRepository.save(prd);
//        if (!file.isEmpty()) {
//
//                    prd.setUrlPhoto(file.getOriginalFilename());
//
//                    file.transferTo(new File(path+"/"+"PROD_"+p.getIdProduit()));
//                             }

        return (p);
    }


    @GetMapping("")
    public List<Produit> getProduits() {

        return produitRepository.findAll();
    }
//
//    @GetMapping("")
//    public Produit findCategorie(Long idProd) {
//
//        return produitRepository.getOne(idProd);
//    }




    @DeleteMapping("")
    public void  deleteProduit(@RequestBody Produit prd) throws IOException {
        produitRepository.delete(prd);
    }

    @PutMapping("")
    public Produit  updateProduit(@RequestBody Produit prd) throws IOException {
        return  produitRepository.save(prd);
    }


    // specific actionRest will recup photo from database
    @RequestMapping(value = "photoProd", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] photoProd(Long idProd) throws IOException {
        Produit prd=produitRepository.getOne(idProd);
        File f=new File(System.getProperty("java.io.tmpdir")+"/PROD_"+idProd+"_"+prd.getUrlPhoto());
        return IOUtils.toByteArray(new FileInputStream(f));
    }


}
