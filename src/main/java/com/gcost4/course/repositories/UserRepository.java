package com.gcost4.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcost4.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
