package com.springboot.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practice.entity.LogoutEntity;
import com.springboot.practice.repository.LogoutRepository;

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
