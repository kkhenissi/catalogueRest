package org.sid.fidecoin.metiers;

import org.sid.fidecoin.entities.AppRole;
import org.sid.fidecoin.entities.AppUser;
import org.sid.fidecoin.entities.Categorie;

public interface IAdminCategorieMetier extends  IAdminProduitMetier{

    public Categorie addCategorie(Categorie cat);


    public void deleteCategorie(Long idCat);
    public void updateCategorie(Categorie cat);



    public void addUser(AppUser usr);
    public void attributeRole(AppRole r, Long idUser);
}
