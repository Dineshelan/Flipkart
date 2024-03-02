package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.entity.OrderEntity;
import com.flipkart.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	@Autowired
	OrderService orderSer;
	
	@PostMapping(value = "/insert")
	public String postData(@RequestBody OrderEntity o) {
		return orderSer.postData(o);
	}

}
