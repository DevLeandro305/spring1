package com.leandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
