package org.sid.fidecoin.metiers;

import org.sid.fidecoin.entities.Produit;

import java.util.List;

public interface IAdminProduitMetier extends IInternauteMetier {

    public Long addProduit(Produit p, Long idCat);


    public void deleteProduit(Long idP);
    public void updateProduit(Produit p);
}
