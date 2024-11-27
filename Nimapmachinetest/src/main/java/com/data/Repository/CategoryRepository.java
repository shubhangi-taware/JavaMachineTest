package com.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
