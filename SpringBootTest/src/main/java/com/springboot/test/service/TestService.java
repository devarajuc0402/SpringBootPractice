package com.springboot.test.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String test() {
		String str = "Hello World!!!";
		System.out.println(str);
		return str;
	}
}
