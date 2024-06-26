package com.educandoweb.course.service;

import com.educandoweb.course.entities.UserT;
import com.educandoweb.course.repositories.UserTRepository;
import com.educandoweb.course.service.exceptions.DatabaseException;
import com.educandoweb.course.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
        return optional.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public UserT save(UserT userT) {
        return repository.save(userT);
    }

    public void deleteById(Long id) {
        findById(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
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
