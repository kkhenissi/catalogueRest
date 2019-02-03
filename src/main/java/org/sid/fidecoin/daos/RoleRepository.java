package org.sid.fidecoin.daos;

import org.sid.fidecoin.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<AppRole, Long> {

    AppRole findByRoleName(String roleName);
}
