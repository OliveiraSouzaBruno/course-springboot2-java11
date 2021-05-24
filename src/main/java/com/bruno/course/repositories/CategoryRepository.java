package com.bruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
