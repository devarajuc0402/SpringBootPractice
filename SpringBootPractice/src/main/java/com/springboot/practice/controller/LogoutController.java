package com.springboot.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.entity.LogoutEntity;
import com.springboot.practice.response.CustomResponse;
import com.springboot.practice.service.LogoutService;

@RestController
@RequestMapping("/api/logout")
public class LogoutController {
	
	@Autowired
	LogoutService logoutService;
	
	@RequestMapping(value = "/logoutUser", method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<CustomResponse> loginUser(@RequestBody LogoutEntity request) {
		CustomResponse response = logoutService.logoutUser(request);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/getLogoutUsers", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
		ResponseEntity<List<LogoutEntity>> getLogoutUsers() {
		List<LogoutEntity> response = logoutService.getLogoutUsers();
		return ResponseEntity.ok(response);
	}

}
