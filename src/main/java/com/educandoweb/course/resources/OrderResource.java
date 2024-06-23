package com.educandoweb.course.resources;

import com.educandoweb.course.entities.OrderT;
import com.educandoweb.course.service.OrderTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderTService OrderTService;

    @GetMapping
    public ResponseEntity<List<OrderT>> findAll() {
        List<OrderT> list = OrderTService.getAllOrderT();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderT> findById(@PathVariable Long id) {
        OrderT obj = OrderTService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
