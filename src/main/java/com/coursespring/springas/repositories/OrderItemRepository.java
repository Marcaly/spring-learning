package com.coursespring.springas.repositories;

import com.coursespring.springas.entities.Order;
import com.coursespring.springas.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
