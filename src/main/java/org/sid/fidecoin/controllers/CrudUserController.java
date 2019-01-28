package org.sid.fidecoin.controllers;

import org.sid.fidecoin.dao.RoleRepository;
import org.sid.fidecoin.entities.Role;
import org.sid.fidecoin.entities.User;
import org.sid.fidecoin.util.RoleEnum;
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
        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println(role);
        user.setRoles(Arrays.asList(role));
        user.setEnable(true);
        super.add(user);

    }


}

