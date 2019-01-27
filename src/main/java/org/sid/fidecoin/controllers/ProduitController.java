package org.sid.fidecoin.controllers;

import org.sid.fidecoin.entities.Item;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produit")
public class ProduitController  extends CrudController<Item, Long> {



}

