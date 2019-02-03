package org.sid.fidecoin.service;

import org.sid.fidecoin.entities.AppRole;
import org.sid.fidecoin.entities.AppUser;

public interface AccountService   {
    public AppUser saveUser(String userName, String password, String confirmPassword);
    public AppRole saveRole(AppRole role);
    public AppUser loadUserByUserName(String userName);
    public void addRoleToUser(String userName, String roleName);

}
