package com.springboot.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerTest {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String test() {
		String str = "Hello World!!!";
		System.out.println(str);
		return str;
	}
}
