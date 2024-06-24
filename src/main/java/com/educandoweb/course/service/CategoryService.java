package com.educandoweb.course.service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getAllCategory() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> optional = repository.findById(id);
        return optional.get();
    }
}
