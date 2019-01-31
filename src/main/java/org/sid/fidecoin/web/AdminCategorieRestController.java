package org.sid.fidecoin.web;

import org.sid.fidecoin.entities.Categorie;
import org.sid.fidecoin.metiers.EcommerceMetierImpl;
import org.sid.fidecoin.metiers.IAdminCategorieMetier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCategorieRestController {

    /**
     * Logger fonctionnel
     */
    private static final Logger LOG_FONCT = LoggerFactory.getLogger("fonctionnel");


    private EcommerceMetierImpl ecommerceMetier;
    @RequestMapping(value = "/adminCat", method = RequestMethod.POST)
    public Categorie saveCategorie(@RequestBody Categorie cat) {


        return ecommerceMetier.addCategorie(cat);

    }


}
