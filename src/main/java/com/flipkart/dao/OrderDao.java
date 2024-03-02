package com.flipkart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.flipkart.entity.OrderEntity;
import com.flipkart.repository.OrderRepository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository orderRepo;
	
	public String postData(OrderEntity o) {
		orderRepo.save(o);
		return "Saved Successfully";
	}

}
