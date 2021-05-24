package com.bruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
