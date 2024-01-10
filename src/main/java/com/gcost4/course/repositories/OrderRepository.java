package com.gcost4.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcost4.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
