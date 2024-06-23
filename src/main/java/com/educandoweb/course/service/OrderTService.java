package com.educandoweb.course.service;

import com.educandoweb.course.entities.OrderT;
import com.educandoweb.course.repositories.OrderTRepository;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderTService {

    @Autowired
    private OrderTRepository OrderRepository;

    public List<OrderT> getAllOrderT() {
        return OrderRepository.findAll();
    }

    public OrderT findById(Long id) {
        Optional<OrderT> optional = OrderRepository.findById(id);
        return optional.get();
    }
}
