package org.sid.fidecoin.controllers;

import org.sid.fidecoin.dao.ItemRepository;
import org.sid.fidecoin.entities.Item;
import org.sid.fidecoin.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class CrudItemController extends CrudController<Item, Long> {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getALL() {

        List<Item> items = super.getALL();
     //   items.forEach(user -> user.setPassword(null));
        return  items;
    }



}

