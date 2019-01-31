package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
