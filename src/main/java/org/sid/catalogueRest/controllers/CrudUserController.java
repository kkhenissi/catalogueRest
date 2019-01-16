package org.sid.catalogueRest.controllers;

import org.sid.catalogueRest.entities.User;
import org.sid.catalogueRest.services.CrudMockServiceImpl;
import org.sid.catalogueRest.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/crud_user")
public class CrudUserController {
    @Autowired
    private ICrudService<User, Long> userService;
    @Autowired
    private CrudMockServiceImpl produitMockService;

    @GetMapping
    public List<User> getALL() {
        return  userService.getaLL();
    }

    @PostMapping
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable  Long id) {
        userService.delete(id);
    }

}


