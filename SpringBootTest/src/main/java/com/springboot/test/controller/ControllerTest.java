package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.LoginEntity;
import com.springboot.test.entity.RegisterEntity;
import com.springboot.test.repository.LoginRepository;
import com.springboot.test.repository.RegisterRepository;

@RestController
@RequestMapping("/api")
public class ControllerTest {

	@Autowired
	RegisterRepository registerRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	@RequestMapping(value = "/getRegisterUsers", method = RequestMethod.GET)
	List<RegisterEntity> getRegisterUsers() {
		List<RegisterEntity> register = registerRepository.findAll();
		System.out.println(register);
		return register;
	}
	
	@RequestMapping(value = "/getLoginUsers", method = RequestMethod.GET)
	List<LoginEntity> getLoginUsers() {
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
