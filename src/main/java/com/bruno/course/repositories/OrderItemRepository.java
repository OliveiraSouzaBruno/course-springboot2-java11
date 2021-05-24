package com.bruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
