package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.ProductEntity;

public interface ProductRepository extends JpaRepository <ProductEntity,Integer>{

}
