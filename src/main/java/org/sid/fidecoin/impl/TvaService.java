package org.sid.fidecoin.impl;

import org.sid.fidecoin.dao.TvaRepository;
import org.sid.fidecoin.entities.Tva;
import org.sid.fidecoin.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class TvaService implements ICrudService<Tva, Long> {


    @Autowired
    private TvaRepository tvaRepository;



    @Override
    public List<Tva> getaLL() {
        return tvaRepository.findAll();
    }



    @Override
    public void add(Tva entity) {
        tvaRepository.save(entity);

    }



    @Override
    public void update(Tva entity) {
        tvaRepository.saveAndFlush(entity);

    }



    @Override
    public void delete(Long id) {
        Tva tva = new Tva();
        tva.setIdTva(id);
        tvaRepository.delete(tva);

    }
}
