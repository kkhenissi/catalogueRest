package org.sid.fidecoin.web;

import org.sid.fidecoin.daos.CategorieRepository;
import org.sid.fidecoin.entities.Categorie;
import org.sid.fidecoin.metiers.EcommerceMetierImpl;
import org.sid.fidecoin.metiers.IAdminCategorieMetier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
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


        return metier.addCategorie(cat);

    }
    @GetMapping("")
    public List<Categorie> getCategories() {

     return categorieRepository.findAll();
    }


}
