package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.*;

import java.util.List;
import java.util.Optional;

public interface IEcommerceDao {

    public Categorie addCategorie(Categorie cat);
    public List<Categorie> listCategories();
    public Optional<Categorie> getCategorie(Long idCat);
    public void deleteCategorie(Long idCat);
    public void updateCategorie(Categorie cat);

    public Long addProduit(Produit p, Long idCat);
    public List<Produit> listProduits();
    public List<Produit> produitsParMotCle(String mc);
    public List<Produit> produitsParCategorie(Long idCat);
    public List<Produit> produitsSelectionnes();
    public Produit getProduit(Long idP);
    public void deleteProduit(Long idP);
    public void updateProduit(Produit p);

    public void addUser(AppUser usr);
    public void attributeRole(AppRole r, Long idUser);
    public Commande saveCommande(Panier p, Client c);
}
