package com.gcost4.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcost4.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
