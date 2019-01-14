package org.sid.catalogueRest.controllers;

import org.sid.catalogueRest.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sid.catalogueRest.services.IProduitService;
import org.sid.catalogueRest.services.ProduitMockServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

    @Autowired
    private IProduitService produitService;
    @Autowired
    private ProduitMockServiceImpl produitMockService;

    @GetMapping
    public List<Produit> getProduits() {
        return  produitService.getProduits();
    }

    @PostMapping
    public void addProduit(@RequestBody  Produit produit) {
        produitService.addProduit(produit);
    }

    @PutMapping
    public void updateProduit(@RequestBody Produit produit) {
        produitService.updateProduit(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable  Long id) {
        produitService.deleteProduit(id);
    }

}

