package org.sid.catalogueRest.services;

import org.sid.catalogueRest.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CrudMockServiceImpl implements ICrudService<Produit , Long> {

    private List<Produit> produits;




    public CrudMockServiceImpl() {
        produits = new ArrayList<Produit>();

        produits.forEach(p -> {
        });

    }





    @Override
    public List<Produit> getaLL() {
        return null;
    }

    @Override
    public void add(Produit produit) {
        produits.add(produit);

    }

    @Override
    public void update(Produit produit) {
        produits.remove(produit);
        produits.add(produit);

    }

    @Override
    public void delete(Long id) {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm>"+ id);
        Produit produit = new Produit();
        produit.setId(id);
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyy>"+ produit.getRef());
        produits.remove(produit);

    }


}
