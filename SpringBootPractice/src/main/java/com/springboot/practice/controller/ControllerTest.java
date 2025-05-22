package com.springboot.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.entity.LoginEntity;
import com.springboot.practice.entity.LogoutEntity;
import com.springboot.practice.service.LoginService;
import com.springboot.practice.service.LogoutService;

@RestController
@RequestMapping("/api")
public class ControllerTest {
	
//	@Autowired
//	LoginService loginService;
	
	@Autowired
	LogoutService logoutService;

//============================================================================

//	@RequestMapping(value = "/getLoginUsers", method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	List<LoginEntity> getLoginUsers() {
//		return loginService.getLoginUsers();
//	}

//============================================================================
	
//	@RequestMapping(value = "/getLogoutUsers", method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	List<LogoutEntity> getLogoutUsers() {
//		return logoutService.getLogoutUsers();
//	}

//============================================================================

}
