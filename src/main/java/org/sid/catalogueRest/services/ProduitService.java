package org.sid.catalogueRest.services;

import org.sid.catalogueRest.dao.ProduitRepository;
import org.sid.catalogueRest.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class ProduitService implements  IProduitService{

    @Autowired

    private ProduitRepository produitRepository;
    @Override
    public List<Produit> getProduits() {
        return this.produitRepository.findAll();
    }

    @Override
    public void addProduit(Produit produit) {
        this.produitRepository.save(produit);

    }

    @Override
    public void updateProduit(Produit produit) {
        this.produitRepository.saveAndFlush(produit);

    }

    @Override
    public void deleteProduit(Long id) {
        Produit produit = new Produit();
        produit.setId(id);
        this.produitRepository.delete(produit);

    }
}
