package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@CrossOrigin("http://localhost:4200")
@RestController
public class MobileController {
	@Autowired
	MobileService mobSer;
	
	@PostMapping(value = "/postAll") 
	public String postAll(@RequestBody List<Mobile> m) { 
		return mobSer.postAll(m);
	}
	
	@GetMapping(value = "/getAll")
	public List<Mobile> getAll() {
		return mobSer.getAll();
	}
	
	@PostMapping(value = "/postData")
	public String postData(@RequestBody Mobile m) {
		return mobSer.postData(m);
	}
}
