package com.springboot.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.repository.RegisterRepository;
import com.springboot.practice.util.JwtUtil;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository registerRepository;

	public List<RegisterEntity> getRegisterUsers() {
		List<RegisterEntity> registerUsers = registerRepository.findAll();
		System.out.println(registerUsers);
		return registerUsers;
	}

	public RegisterEntity registerUser(RegisterEntity request) {
		RegisterEntity response = new RegisterEntity();
		// web created token in client
		String token = JwtUtil.generateToken(request.getLoginPassword());
		System.out.println("Password Token: "+token);
		// extract password from token in server
		String password = JwtUtil.extractPassword(token);
		System.out.println("Extracted Password: "+password);
		request.setLoginPassword(password);
		try {
			response = registerRepository.save(request);	
		} catch (Exception e) {
			response.setEmail(request.getEmail()+"-"+e.toString());
		}
		return response;
	}
	
}
