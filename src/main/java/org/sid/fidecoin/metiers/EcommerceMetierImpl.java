package org.sid.fidecoin.metiers;

import org.sid.fidecoin.daos.IEcommerceDao;
import org.sid.fidecoin.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class EcommerceMetierImpl  implements IAdminCategorieMetier{
    @Autowired
    private IEcommerceDao iecommerceDao;
    @Override
    public Categorie addCategorie(Categorie cat) {
        return iecommerceDao.addCategorie(cat);
    }

    @Override
    public void deleteCategorie(Long idCat) {
        iecommerceDao.deleteCategorie(idCat);

    }

    @Override
    public void updateCategorie(Categorie cat) {
        iecommerceDao.updateCategorie(cat);

    }

    @Override
    public void addUser(User usr) {
        iecommerceDao.addUser(usr);

    }

    @Override
    public void attributeRole(Role r, Long idUser) {
        iecommerceDao.attributeRole(r, idUser);

    }

    @Override
    public Long addProduit(Produit p, Long idCat) {
        return iecommerceDao.addProduit(p, idCat);
    }

    @Override
    public void deleteProduit(Long idP) {
        iecommerceDao.deleteProduit(idP);

    }

    @Override
    public void updateProduit(Produit p) {
        iecommerceDao.updateProduit(p);

    }

    @Override
    public List<Categorie> listCategories() {
        return iecommerceDao.listCategories();
    }

    @Override
    public Categorie getCategorie(Long idCat) {
        return null;
    }

    @Override
    public List<Produit> listProduits() {
        return iecommerceDao.listProduits();
    }

    @Override
    public List<Produit> produitsParMotCle(String mc) {
        return iecommerceDao.produitsParMotCle(mc);
    }

    @Override
    public List<Produit> produitsParCategorie(Long idCat) {
        return iecommerceDao.produitsParCategorie(idCat);
    }

    @Override
    public List<Produit> produitsSelectionnes() {
        return iecommerceDao.produitsSelectionnes();
    }

    @Override
    public Produit getProduit(Long idP) {
        return iecommerceDao.getProduit(idP);
    }

    @Override
    public Commande saveCommande(Panier p, Client c) {
        return iecommerceDao.saveCommande(p,c);
    }
}
