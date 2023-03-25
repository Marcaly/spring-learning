package com.coursespring.springas.services;

import com.coursespring.springas.entities.Order;
import com.coursespring.springas.entities.User;
import com.coursespring.springas.repositories.OrderRepository;
import com.coursespring.springas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
