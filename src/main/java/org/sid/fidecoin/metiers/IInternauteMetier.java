package org.sid.fidecoin.metiers;

import org.sid.fidecoin.entities.*;

import java.util.List;

public interface IInternauteMetier {


    public List<Categorie> listCategories();
    public Categorie getCategorie(Long idCat);


    public List<Produit> listProduits();
    public List<Produit> produitsParMotCle(String mc);
    public List<Produit> produitsParCategorie(Long idCat);
    public List<Produit> produitsSelectionnes();
    public Produit getProduit(Long idP);


    public Commande saveCommande(Panier p, Client c);
}
