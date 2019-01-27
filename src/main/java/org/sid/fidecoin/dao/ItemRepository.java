package org.sid.fidecoin.dao;

import org.sid.fidecoin.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}

