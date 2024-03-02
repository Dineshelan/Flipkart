package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.OrderEntity;

public interface OrderRepository extends JpaRepository <OrderEntity,Integer> {

}
