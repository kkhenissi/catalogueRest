package org.sid.fidecoin.dao;

import org.sid.fidecoin.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
