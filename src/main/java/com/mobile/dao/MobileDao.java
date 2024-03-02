package com.mobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;
import com.mobile.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mobRepo;
	
	public String postAll(List<Mobile> m) {
		mobRepo.saveAll(m);
		return "Saved Successfully";
	}
	public List<Mobile> getAll() {
		return mobRepo.findAll();
	}
	public String postData(Mobile m) {
		mobRepo.save(m);
		return "Saved Successfully";
	}
	
}
