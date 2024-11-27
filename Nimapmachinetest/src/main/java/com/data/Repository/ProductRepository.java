package com.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
