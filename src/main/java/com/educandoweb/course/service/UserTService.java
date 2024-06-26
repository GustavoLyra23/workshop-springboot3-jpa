package com.educandoweb.course.service;

import com.educandoweb.course.entities.UserT;
import com.educandoweb.course.repositories.UserTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserTService {

    @Autowired
    private UserTRepository repository;

    public List<UserT> getAllUserT() {
        return repository.findAll();
    }

    public UserT findById(Long id) {
        Optional<UserT> optional = repository.findById(id);
        return optional.get();
    }

    public UserT save(UserT userT) {
        return repository.save(userT);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public UserT update(Long id, UserT userT) {

        UserT user = repository.getReferenceById(id);
        updateData(user, userT);
        return repository.save(user);

    }

    private void updateData(UserT user, UserT userT) {
        user.setName(userT.getName());
        user.setEmail(userT.getEmail());
        user.setPhone(userT.getPhone());


    }
}
