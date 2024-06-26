package com.educandoweb.course.resources;

import com.educandoweb.course.entities.UserT;
import com.educandoweb.course.service.UserTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<UserT> insert(@RequestBody UserT obj) {
        obj = userTService.save(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userTService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
