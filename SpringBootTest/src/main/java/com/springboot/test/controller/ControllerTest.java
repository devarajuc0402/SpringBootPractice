package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.LoginEntity;
import com.springboot.test.repository.LoginRepository;

@RestController
@RequestMapping("/api")
public class ControllerTest {

	@Autowired
	LoginRepository loginRepository;
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	List<LoginEntity> getUsers() {
		List<LoginEntity> list = loginRepository.findAll();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String test() {
		String str = "Hello World!!!";
		System.out.println(str);
		return str;
	}
}
