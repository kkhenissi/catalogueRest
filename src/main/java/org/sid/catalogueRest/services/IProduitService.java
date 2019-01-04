package org.sid.catalogueRest.services;

import org.sid.catalogueRest.entities.Produit;

import java.util.List;

public interface IProduitService {

    List<Produit> getProduits();

    void addProduit(Produit produit);

    void updateProduit(Produit produit);

    void deleteProduit(String ref);
}
