package org.sid.catalogueRest.controllers;

import org.sid.catalogueRest.entities.Produit;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produit")
public class ProduitController  extends CrudController<Produit, Long> {



}

