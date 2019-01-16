package org.sid.catalogueRest.impl;

import org.sid.catalogueRest.dao.ProduitRepository;
import org.sid.catalogueRest.entities.Produit;
import org.sid.catalogueRest.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class ProduitService implements ICrudService<Produit, Long> {

    @Autowired

    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getaLL() {
        return this.produitRepository.findAll();
    }

    @Override
    public void add(Produit entity) {
        this.produitRepository.save(entity);

    }

    @Override
    public void update(Produit entity) {
        this.produitRepository.saveAndFlush(entity);

    }

    @Override
    public void delete(Long id) {
        Produit produit = new Produit();
        produit.setId(id);
        this.produitRepository.delete(produit);


    }
}
