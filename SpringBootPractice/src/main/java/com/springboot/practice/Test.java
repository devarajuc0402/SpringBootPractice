package com.springboot.practice;

import com.springboot.practice.util.JwtUtil;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		jwtPassword();
	}
	
	public static void jwtPassword() {
		String token = JwtUtil.generateToken("Hello@123");
		System.out.println("Password Token: "+token);
		String password = JwtUtil.extractPassword(token);
		System.out.println("Extracted Password: "+password);
	}
}
