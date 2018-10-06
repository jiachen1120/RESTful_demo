package com.jiachen.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiachen.home.entity.JcHome;
import com.jiachen.home.repository.HomeRepository;
import com.jiachen.home.service.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	HomeRepository homeRepository;

	@Override
	public List<JcHome> getUserList() {
		return (List<JcHome>) homeRepository.findAll();
	}

	@Override
	public void addUser(JcHome jcHome) {
		homeRepository.save(jcHome);
	}
	
	

}
