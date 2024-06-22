package com.educandoweb.course.resources;

import com.educandoweb.course.entities.UserT;
import com.educandoweb.course.service.UserTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserTService userTService;

    @GetMapping
    public ResponseEntity<List<UserT>> findAll() {
        List<UserT> list = userTService.getAllUserT();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserT> findById(@PathVariable Long id) {
        UserT obj = userTService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
