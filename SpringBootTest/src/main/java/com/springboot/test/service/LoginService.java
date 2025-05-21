package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.LoginEntity;
import com.springboot.test.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public List<LoginEntity> getLoginUsers() {
		List<LoginEntity> loginUsers = loginRepository.findAll();
		System.out.println(loginUsers);
		return loginUsers;
	}
}
