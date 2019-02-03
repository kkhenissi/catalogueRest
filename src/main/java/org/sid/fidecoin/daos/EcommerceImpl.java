package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Component
public class EcommerceImpl implements IEcommerceDao {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public Categorie addCategorie(Categorie cat) {

        categorieRepository.save(cat);
        return cat;
    }

    @Override
    public List<Categorie> listCategories() {
    //    Query req=em.createQuery("select c from Categorie c");
        return categorieRepository.findAll();
    }

    @Override
    public Optional<Categorie> getCategorie(Long idCat) {

        return categorieRepository.findById(idCat);
    }

    @Override
    public void deleteCategorie(@PathVariable("id")Long id) {
     //   categorieRepository.delete(id);

    }

    @Override
    public void updateCategorie(Categorie cat) {
      //  em.merge(cat);

    }

    @Override
    public Long addProduit(Produit p, Long idCat) {
//        Categorie cat=em.find(Categorie.class, idCat);
//        p.setCategorie(cat);
//        em.persist(p);
       return null;

    }

    @Override
    public List<Produit> listProduits() {
//        Query req=em.createQuery("select p from Produit p");
      return null;
    }

    @Override
    public List<Produit> produitsParMotCle(String mc) {
//        Query req=em.createQuery("select p from Produit p where p.designation like :x");
//        req.setParameter("x", "%"+mc+"%");
        return null;
    }

    @Override
    public List<Produit> produitsParCategorie(Long idCat) {
//        Query req=em.createQuery("select p from Produit p where p.categorie.idCategorie =:x");
//        req.setParameter("x", idCat);
       return null;
    }

    @Override
    public List<Produit> produitsSelectionnes() {
//        Query req=em.createQuery("select p from Produit p where p.selectedProduit=true");
       return null;
    }

    @Override
    public Produit getProduit(Long idP)
    {
        return null;
    }

    @Override
    public void deleteProduit(Long idP) {
//        Produit p=getProduit(idP);
//        em.remove(p);

    }

    @Override
    public void updateProduit(Produit p) {
    //    em.merge(p);

    }

    @Override
    public void addUser(AppUser usr) {

        // em.persist(usr);
    }

    @Override
    public void attributeRole(AppRole r, Long idUser) {
//      AppUser u=em.find(AppUser.class,idUser);
//      u.getAppRoles().add(r);
//      em.persist(u);
    }

    @Override
    public Commande saveCommande(Panier p, Client c) {
//        em.persist(c);
//        Commande cmd=new Commande();
//        cmd.setClient(c);
//        cmd.setDateCommande(new Date());
//        cmd.setLigneCommandes(p.getItems());
//        for(LigneCommande lc:p.getItems()){
//            em.persist(lc);
 //       }
       // em.persist(cmd);
        return null;
    }
}
