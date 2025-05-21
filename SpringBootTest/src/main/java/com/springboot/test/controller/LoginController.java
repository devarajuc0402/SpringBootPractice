package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.LoginEntity;
import com.springboot.test.response.CustomResponse;
import com.springboot.test.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/loginUser", method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<CustomResponse> loginUser(@RequestBody LoginEntity request) {
		CustomResponse response = loginService.loginUser(request);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/getLoginUsers", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<LoginEntity>> getLoginUsers() {
		List<LoginEntity> response = loginService.getLoginUsers();
		return ResponseEntity.ok(response);
	}

}
