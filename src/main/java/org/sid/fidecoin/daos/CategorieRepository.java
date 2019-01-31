package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
