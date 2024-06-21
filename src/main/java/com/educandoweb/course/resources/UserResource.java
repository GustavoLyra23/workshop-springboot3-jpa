package com.educandoweb.course.resources;

import com.educandoweb.course.entities.UserT;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<UserT> findAll() {
        UserT u = new UserT("12345", "99999", "maria@gmail.com", "Maria", 1L);
        return ResponseEntity.ok().body(u);
    }
}
