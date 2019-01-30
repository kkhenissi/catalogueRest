package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class EcommerceImpl implements IEcommerceDao {
    @Autowired
    private EntityManager em;
    @Override
    public Long addCategorie(Categorie cat) {
        em.persist(cat);
        return cat.getIdCategorie();
    }

    @Override
    public List<Categorie> listCategories() {
        Query req=em.createQuery("select c from Categorie c");
        return req.getResultList();
    }

    @Override
    public Categorie getCategorie(Long idCat) {
        return em.find(Categorie.class, idCat);
    }

    @Override
    public void deleteCategorie(Long idCat) {
        Categorie c =em.find(Categorie.class, idCat);
        em.remove(c);

    }

    @Override
    public void updateCategorie(Categorie cat) {
        em.merge(cat);

    }

    @Override
    public Long addProduit(Produit p, Long idCat) {
        Categorie cat=em.find(Categorie.class, idCat);
        p.setCategorie(cat);
        em.persist(p);
        return p.getIdProduit();

    }

    @Override
    public List<Produit> listProduits() {
        Query req=em.createQuery("select p from Produit p");
        return req.getResultList();
    }

    @Override
    public List<Produit> produitsParMotCle(String mc) {
        Query req=em.createQuery("select p from Produit p where p.designation like :x");
        req.setParameter("x", "%"+mc+"%");
        return req.getResultList();
    }

    @Override
    public List<Produit> produitsParCategorie(Long idCat) {
        Query req=em.createQuery("select p from Produit p where p.categorie.idCategorie =:x");
        req.setParameter("x", idCat);
        return req.getResultList();
    }

    @Override
    public List<Produit> produitsSelectionnes() {
        Query req=em.createQuery("select p from Produit p where p.selectedProduit=true");
        return req.getResultList();
    }

    @Override
    public Produit getProduit(Long idP) {
        return em.find(Produit.class, idP);
    }

    @Override
    public void deleteProduit(Long idP) {
        Produit p=getProduit(idP);
        em.remove(p);

    }

    @Override
    public void updateProduit(Produit p) {
        em.merge(p);

    }

    @Override
    public void addUser(User usr) {
         em.persist(usr);
    }

    @Override
    public void attributeRole(Role r, Long idUser) {
      User u=em.find(User.class,idUser);
      u.getRoles().add(r);
      em.persist(u);
    }

    @Override
    public Commande saveCommande(Panier p, Client c) {
        em.persist(c);
        Commande cmd=new Commande();
        cmd.setClient(c);
        cmd.setDateCommande(new Date());
        cmd.setLigneCommandes(p.getItems());
        for(LigneCommande lc:p.getItems()){
            em.persist(lc);
        }
        em.persist(cmd);
        return cmd;
    }
}
