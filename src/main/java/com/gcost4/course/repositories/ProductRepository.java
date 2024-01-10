package com.gcost4.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcost4.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
