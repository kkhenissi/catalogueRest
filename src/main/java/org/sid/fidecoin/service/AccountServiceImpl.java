package org.sid.fidecoin.service;

import org.sid.fidecoin.daos.RoleRepository;
import org.sid.fidecoin.daos.UserRepository;
import org.sid.fidecoin.entities.AppRole;
import org.sid.fidecoin.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public AppUser saveUser(String userName, String password, String confirmPassword) {

        AppUser user = userRepository.findByUserName(userName);
        if(user!=null) throw new RuntimeException("userName not available !!");
        if (!password.equals(confirmPassword)) throw new RuntimeException("confirm password wrong !!");
        AppUser appUser = new AppUser();
        appUser.setUserName(userName);
        appUser.setActive(true);
        appUser.setPassword(bCryptPasswordEncoder.encode(password));
        userRepository.save(appUser);
        addRoleToUser(userName, "ROLE_USER");

        return appUser;
    }

    @Override
    public AppRole saveRole(AppRole role) {

     return   roleRepository.save(role);
    }

    @Override
    public AppUser loadUserByUserName(String userName) {

        return userRepository.findByUserName(userName);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {


        AppUser appUser = userRepository.findByUserName(userName);
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        System.out.println(appUser.toString());
        AppRole appRole =  roleRepository.findByRoleName(roleName);
        if (appUser != null && appRole != null) {
            System.out.println("ssssssssssssssssssssssssssssssssssssssssssss");
              appUser.getAppRoles().add(appRole);
            userRepository.saveAndFlush(appUser);
        }



    }
}
