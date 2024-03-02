package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.flipkart.dao.OrderDao;
import com.flipkart.entity.OrderEntity;

@Service
public class OrderService {
	@Autowired
	OrderDao orderDao;
	
	public String postData(OrderEntity o) {
		return orderDao.postData(o);
	}
}
