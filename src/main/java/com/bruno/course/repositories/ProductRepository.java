package com.bruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
