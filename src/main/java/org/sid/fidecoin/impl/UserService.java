package org.sid.fidecoin.impl;

import org.sid.fidecoin.dao.UserRepository;
import org.sid.fidecoin.entities.User;
import org.sid.fidecoin.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserService implements ICrudService<User, Long > {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getaLL() {
        return this.userRepository.findAll();
    }

    @Override
    public void add(User entity) {
        this.userRepository.save(entity);

    }

    @Override
    public void update(User entity) {
        this.userRepository.saveAndFlush(entity);

    }

    @Override
    public void delete(Long id) {
        User user = new User();
        user.setId(id);
        this.userRepository.delete(user);

    }
}
