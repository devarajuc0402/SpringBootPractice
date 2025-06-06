package com.springboot.practice.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.entity.LoginEntity;
import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.response.CustomResponse;
import com.springboot.practice.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/loginUser", method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<CustomResponse> loginUser(@RequestBody RegisterEntity request) {
		CustomResponse customResponse = new CustomResponse();
		try {
			CompletableFuture<CustomResponse> response = loginService.loginUser(request);
			customResponse = response.get();
			return ResponseEntity.ok(customResponse);
		} catch (Exception e) {
			customResponse.setReponseName("Login");
			customResponse.setReponseName(e.toString());
			return ResponseEntity.ok(customResponse);
		}
	}
	
	@RequestMapping(value = "/getLoginUsers", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<LoginEntity>> getLoginUsers() {
		List<LoginEntity> response = loginService.getLoginUsers();
		return ResponseEntity.ok(response);
	}

}
