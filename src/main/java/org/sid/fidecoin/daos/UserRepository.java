package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface UserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);

    AppUser findByPassword(String password);
}
