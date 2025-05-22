package com.springboot.practice.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public String test() {
		String str = "Hello World!!!";
		System.out.println(str);
		return str;
	}
}
