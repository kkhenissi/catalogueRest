package org.sid.fidecoin.web;

import org.apache.commons.io.IOUtils;
import org.sid.fidecoin.daos.CategorieRepository;
import org.sid.fidecoin.entities.Categorie;
import org.sid.fidecoin.metiers.EcommerceMetierImpl;
import org.sid.fidecoin.metiers.IAdminCategorieMetier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/adminCat")
@CrossOrigin(origins = "*")
public class AdminCategorieRestController {

    /**
     * Logger fonctionnel
     */
    private static final Logger LOG_FONCT = LoggerFactory.getLogger("fonctionnel");
//    @Autowired
//    private EcommerceMetierImpl ecommerceMetier;
    @Autowired
    private IAdminCategorieMetier metier;
    @Autowired
    private CategorieRepository categorieRepository;


//    public AdminCategorieRestController(EcommerceMetierImpl ecommerceMetier)  {
//        this.ecommerceMetier = ecommerceMetier;
//    }


    @PostMapping("")
    public Categorie saveCategorie(@RequestBody Categorie cat,
                                   MultipartFile file) throws IOException {

//        if (!file.isEmpty()) {
//           // look if is a veritable photo
//            BufferedImage bi = ImageIO.read(file.getInputStream());
//           //  BufferedImage allow us to redimention photo if we wont
//            cat.setNomPhoto(file.getOriginalFilename());
//            cat.setPhoto(file.getBytes());
//        }


        return categorieRepository.save(cat);
    }


    @GetMapping("")
    public List<Categorie> getCategories() {

     return categorieRepository.findAll();
    }


    // specific actionRest will recup photo from database
    @RequestMapping(value = "photoCat", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] photoCat(Long idCat) throws IOException {
        Categorie cat=categorieRepository.getOne(idCat);


        return IOUtils.toByteArray(new ByteArrayInputStream(cat.getPhoto()));

    }

    @DeleteMapping("")
    public void  deleteCategorie(@RequestBody Categorie cat) throws IOException {

       categorieRepository.delete(cat);
    }

    @PutMapping("")
    public Categorie  updateCategorie(@RequestBody Categorie cat) throws IOException {

      return  categorieRepository.saveAndFlush(cat);

    }


}
