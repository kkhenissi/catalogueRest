package org.sid.fidecoin.impl;

import org.sid.fidecoin.dao.ItemRepository;

import org.sid.fidecoin.entities.Item;
import org.sid.fidecoin.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class ItemService implements ICrudService<Item, Long> {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getaLL() {
        return itemRepository.findAll();
    }

    @Override
    public void add(Item entity) {
        itemRepository.save(entity);

    }

    @Override
    public void update(Item entity) {
        itemRepository.saveAndFlush(entity);

    }

    @Override
    public void delete(Long id) {
        Item item = new Item();
        item.setIdItem(id);
        itemRepository.delete(item);


    }
}
