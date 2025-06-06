package com.springboot.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.repository.RegisterRepository;

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
		try {
			response = registerRepository.save(request);	
		} catch (Exception e) {
			response.setEmail(request.getEmail()+"-"+e.toString());
		}
		return response;
	}
	
}
