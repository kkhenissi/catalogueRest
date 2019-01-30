package org.sid.fidecoin.metiers;

import org.sid.fidecoin.entities.Categorie;
import org.sid.fidecoin.entities.Role;
import org.sid.fidecoin.entities.User;

public interface IAdminCategorieMetier extends  IAdminProduitMetier{

    public Categorie addCategorie(Categorie cat);


    public void deleteCategorie(Long idCat);
    public void updateCategorie(Categorie cat);



    public void addUser(User usr);
    public void attributeRole(Role r, Long idUser);
}
