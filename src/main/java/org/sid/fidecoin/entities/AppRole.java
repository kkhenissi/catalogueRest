package org.sid.fidecoin.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.sid.fidecoin.util.RoleEnum;

import javax.persistence.*;
import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROLE_ID")
    private Long idRole;
    private String roleName;

    public AppRole(RoleEnum role) {
        this.roleName = role.getName();
    }

    public Long getIdRole() {
        return idRole;
    }

  //  public void setIdRole(Long idRole) {
  //      this.idRole = idRole;
 //   }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
