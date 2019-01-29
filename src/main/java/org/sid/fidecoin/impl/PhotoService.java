package org.sid.fidecoin.impl;

import org.sid.fidecoin.dao.PhotoRepository;
import org.sid.fidecoin.entities.Photo;
import org.sid.fidecoin.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PhotoService implements ICrudService<Photo, Long> {

    @Autowired
    private PhotoRepository photoRepository;



    @Override
    public List<Photo> getaLL() {
        return photoRepository.findAll();
    }



    @Override
    public void add(Photo entity) {
        photoRepository.save(entity);

    }



    @Override
    public void update(Photo entity) {
        photoRepository.saveAndFlush(entity);

    }



    @Override
    public void delete(Long id) {
        Photo ph = new Photo();
        ph.setIdPhoto(id);
        photoRepository.delete(ph);

    }
}
