package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);

    User findByPassword(String password);
}
