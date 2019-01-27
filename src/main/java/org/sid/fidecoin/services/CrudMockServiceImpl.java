package org.sid.fidecoin.services;

import org.sid.fidecoin.entities.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CrudMockServiceImpl implements ICrudService<Item, Long> {

    private List<Item> items;




    public CrudMockServiceImpl() {
        items = new ArrayList<Item>();

        items.forEach(p -> {
        });

    }





    @Override
    public List<Item> getaLL() {
        return null;
    }

    @Override
    public void add(Item item) {
        items.add(item);

    }

    @Override
    public void update(Item item) {
        items.remove(item);
        items.add(item);

    }

    @Override
    public void delete(Long id) {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm>"+ id);
        Item item = new Item();
        item.setIdItem(id);
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyy>"+ item.getNameItem());
        items.remove(item);

    }


}
