package com.leandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
