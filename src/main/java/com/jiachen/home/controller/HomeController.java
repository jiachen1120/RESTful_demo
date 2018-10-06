package com.jiachen.home.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jiachen.home.entity.JcHome;
import com.jiachen.home.service.impl.HomeServiceImpl;

@RestController
public class HomeController {

	@Autowired
	HomeServiceImpl homeService;

	@GetMapping("/info")
	public Map<String, Object> getInfo() {
		Map<String, Object> result = new HashMap<>();
		result.put("STATUS", "SUCCESS");
		List<JcHome> userList = homeService.getUserList();
		result.put("USER_LIST", userList);
		return result;
	}

	@PostMapping("/info")
	public Map<String, Object> addInfo(@RequestBody JcHome jcHome) {
		Map<String, Object> result = new HashMap<>();
		homeService.addUser(jcHome);
		result.put("STATUS", "SUCCESS");
		return result;
	}
}
