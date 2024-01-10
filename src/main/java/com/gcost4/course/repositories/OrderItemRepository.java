package com.gcost4.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcost4.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
