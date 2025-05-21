package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.LogoutEntity;
import com.springboot.test.repository.LogoutRepository;

@Service
public class LogoutService {

	@Autowired
	LogoutRepository logoutRepository;
	
	public List<LogoutEntity> getLogoutUsers() {
		List<LogoutEntity> logoutUsers = logoutRepository.findAll();
		System.out.println(logoutUsers);
		return logoutUsers;
	}
}
