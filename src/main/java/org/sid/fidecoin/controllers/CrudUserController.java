package org.sid.catalogueRest.controllers;

import org.sid.catalogueRest.dao.RoleRepository;
import org.sid.catalogueRest.entities.Role;
import org.sid.catalogueRest.entities.User;
import org.sid.catalogueRest.util.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/crud_user")
public class CrudUserController extends CrudController<User, Long> {
    @Autowired
    private RoleRepository roleRepository;

    public List<User> getALL() {

        List<User> users = super.getALL();
         users.forEach(user -> user.setPassword(null));
        return  users;
    }

    public void add(@RequestBody  User user) {
        Role role = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        user.setRoles(Arrays.asList(role));
        user.setEnable(true);
        super.add(user);

    }


}


