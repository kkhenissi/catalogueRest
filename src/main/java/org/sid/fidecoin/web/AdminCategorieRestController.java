package org.sid.fidecoin.web;

import org.sid.fidecoin.entities.Categorie;
import org.sid.fidecoin.metiers.EcommerceMetierImpl;
import org.sid.fidecoin.metiers.IAdminCategorieMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCategorieRestController {
//    @Autowired
//    private EcommerceMetierImpl metier;
    @RequestMapping(value = "/adminCat", method = RequestMethod.POST)
    public Categorie saveCategorie(@RequestBody Categorie cat) {


        return null;
                //metier.addCategorie(cat);

    }


}
