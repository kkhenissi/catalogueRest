package org.sid.catalogueRest.services;

import org.sid.catalogueRest.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProduitMockServiceImpl implements IProduitService {

    private List<Produit> produits;




    public ProduitMockServiceImpl() {
        produits = new ArrayList<Produit>();

        produits.forEach(p -> {
        });

    }




    @Override
    public List<Produit> getProduits() {
        return produits;
    }

    @Override
    public void addProduit(Produit produit) {
        produits.add(produit);

    }

    @Override
    public void updateProduit(Produit produit) {
        produits.remove(produit);
        produits.add(produit);

    }

    @Override
    public void deleteProduit(Long id) {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm>"+ id);
        Produit produit = new Produit();
        produit.setId(id);
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyy>"+ produit.getRef());
        produits.remove(produit);


    }
}
