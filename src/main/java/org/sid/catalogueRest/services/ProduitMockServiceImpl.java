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

        produits.add(new Produit("Livre", 512, 250));
        produits.add(new Produit("Cahier", 312, 215));
        produits.add(new Produit("Stylo", 342, 12));
        produits.add(new Produit("Valise", 52, 1550));
        produits.add(new Produit("Ram papier", 112, 125));
        produits.add(new Produit("LXXXXXX", 622, 250));
        produits.add(new Produit("LDDDDDD", 422, 275));
        produits.add(new Produit("LZZZZZZ", 612, 650));


        produits.forEach(p -> {
           System.out.println("Produit: " + p);
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
    public void deleteProduit(String ref) {
        Produit produit = new Produit();
        produit.setRef(ref);
        produits.remove(produit);


    }
}
