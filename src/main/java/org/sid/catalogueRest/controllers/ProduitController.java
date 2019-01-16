package org.sid.catalogueRest.controllers;

import org.sid.catalogueRest.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sid.catalogueRest.services.ICrudService;
import org.sid.catalogueRest.services.CrudMockServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

    @Autowired
    private ICrudService<Produit, Long> produitService;
    @Autowired
    private CrudMockServiceImpl produitMockService;

    @GetMapping
    public List<Produit> getALL() {
        return  produitService.getaLL();
    }

    @PostMapping
    public void add(@RequestBody  Produit produit) {
        produitService.add(produit);
    }

    @PutMapping
    public void update(@RequestBody Produit produit) {
        produitService.update(produit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable  Long id) {
        produitService.delete(id);
    }

}

