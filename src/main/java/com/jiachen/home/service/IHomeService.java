package com.jiachen.home.service;

import java.util.List;

import com.jiachen.home.entity.JcHome;

public interface IHomeService {
	public List<JcHome> getUserList();
	
	public void addUser(JcHome jchome);
}
