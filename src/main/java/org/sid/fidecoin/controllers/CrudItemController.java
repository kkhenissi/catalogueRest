package org.sid.fidecoin.controllers;

import org.sid.fidecoin.dao.ItemRepository;
import org.sid.fidecoin.dao.TvaRepository;
import org.sid.fidecoin.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class CrudItemController extends CrudController<Item, Long> {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    TvaRepository tvaRepository;

    public List<Item> getALL() {

        List<Item> items = super.getALL();
     //   items.forEach(user -> user.setPassword(null));
        return  items;
    }
    public void add(@RequestBody  Item item) {
     //   Tva tva = tvaRepository.findByName(TvaEnum.ROLE_USER.getName());
        System.out.println("///////////////////////////////////////////////////////////");


    }


}

