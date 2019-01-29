package org.sid.fidecoin.dao;

import org.sid.fidecoin.entities.Tva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TvaRepository extends JpaRepository<Tva, Long> {
}
