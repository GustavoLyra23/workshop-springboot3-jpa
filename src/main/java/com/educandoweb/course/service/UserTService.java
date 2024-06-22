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
}
