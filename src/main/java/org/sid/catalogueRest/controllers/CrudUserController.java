package org.sid.catalogueRest.controllers;

import org.sid.catalogueRest.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud_user")
public class CrudUserController extends CrudController<User, Long> {

    public List<User> getALL() {

        List<User> users = super.getALL();
         users.forEach(user -> user.setPassword(null));
        return  users;
    }


}


