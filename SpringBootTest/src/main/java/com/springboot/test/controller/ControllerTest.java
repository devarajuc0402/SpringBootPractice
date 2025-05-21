package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.LoginEntity;
import com.springboot.test.entity.LogoutEntity;
import com.springboot.test.entity.RegisterEntity;
import com.springboot.test.repository.LoginRepository;
import com.springboot.test.repository.RegisterRepository;
import com.springboot.test.service.LoginService;
import com.springboot.test.service.LogoutService;
import com.springboot.test.service.RegisterService;

@RestController
@RequestMapping("/api")
public class ControllerTest {
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	LogoutService logoutService;
	
	@RequestMapping(value = "/getRegisterUsers", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	List<RegisterEntity> getRegisterUsers() {
		return registerService.getRegisterUsers();
	}
	
	@RequestMapping(value = "/getLoginUsers", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	List<LoginEntity> getLoginUsers() {
		return loginService.getLoginUsers();
	}
	
	@RequestMapping(value = "/getLogoutUsers", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	List<LogoutEntity> getLogoutUsers() {
		return logoutService.getLogoutUsers();
	}

}
