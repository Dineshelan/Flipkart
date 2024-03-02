package com.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao mobDao;
	
	public String postAll(List<Mobile> m) {
		return mobDao.postAll(m);
	}
	public List<Mobile> getAll() {
		return mobDao.getAll();
	}
	public String postData(Mobile  m) {
		return mobDao.postData(m);
	}

}
