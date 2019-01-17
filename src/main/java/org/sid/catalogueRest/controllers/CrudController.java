package org.sid.catalogueRest.controllers;


import org.sid.catalogueRest.services.CrudMockServiceImpl;
import org.sid.catalogueRest.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class CrudController<T, ID> {

    @Autowired
    private ICrudService<T, ID> service;
    @Autowired
    private CrudMockServiceImpl produitMockService;

    @GetMapping
    public List<T> getALL() {
        return  service.getaLL();
    }

    @PostMapping
    public void add(@RequestBody  T entity) {
        service.add(entity);
    }

    @PutMapping
    public void update(@RequestBody T entity) {
        service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable  ID id) {
        service.delete(id);
    }

}

