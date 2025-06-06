package com.springboot.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.service.RegisterService;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<RegisterEntity> registerUser(@RequestBody RegisterEntity request) {
		RegisterEntity response = registerService.registerUser(request);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(value = "/getRegisterUsers", 
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<RegisterEntity>> getRegisterUsers() {
		List<RegisterEntity> response = registerService.getRegisterUsers();
		return ResponseEntity.ok(response);
	}

}
