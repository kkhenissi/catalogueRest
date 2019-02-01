package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String name);
}
