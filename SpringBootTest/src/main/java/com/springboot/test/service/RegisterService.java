package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.RegisterEntity;
import com.springboot.test.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository registerRepository;

	public List<RegisterEntity> getRegisterUsers() {
		List<RegisterEntity> register = registerRepository.findAll();
		System.out.println(register);
		return register;
	}
	
}
