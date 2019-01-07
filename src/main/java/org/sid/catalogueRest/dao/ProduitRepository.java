package org.sid.catalogueRest.dao;

import org.sid.catalogueRest.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long > {
}
