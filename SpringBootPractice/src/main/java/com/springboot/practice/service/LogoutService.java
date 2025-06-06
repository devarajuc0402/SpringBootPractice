package com.springboot.practice.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practice.constants.Constant;
import com.springboot.practice.entity.LoginEntity;
import com.springboot.practice.entity.LogoutEntity;
import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.repository.LoginRepository;
import com.springboot.practice.repository.LogoutRepository;
import com.springboot.practice.response.CustomResponse;

@Service
public class LogoutService {

	@Autowired
	LogoutRepository logoutRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	public CustomResponse logoutUser(LogoutEntity request) {
		CustomResponse customResponse = new CustomResponse();
		String email = request.getEmail();
		Optional<LoginEntity> loginResponse = null;
		if(email != null && !email.isBlank()) {
			loginResponse = loginRepository.findByEmail(email);
			if(loginResponse != null) {
				LogoutEntity logoutEntity = mapLogoutEntity(loginResponse.get());
				LogoutEntity LogoutResponse = logoutRepository.save(logoutEntity);
				System.out.println(loginResponse.get());
				customResponse.setReponseName("Logout");
				customResponse.setPayload(LogoutResponse.toString());
			} else {
				customResponse.setPayload("Please provide the email");
			}
		} else {
			customResponse.setPayload("Please provide the email");
		}
		return customResponse;
	}
	
	private LogoutEntity mapLogoutEntity(LoginEntity loginResponse) {
		LogoutEntity logoutEntity = new LogoutEntity();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		logoutEntity.setEmail(loginResponse.getEmail());
		logoutEntity.setUserName(loginResponse.getUserName());
		logoutEntity.setLoginUserType(loginResponse.getLoginUserType());
		logoutEntity.setLastLoginDate(timestamp);
		return logoutEntity;
	}

	public List<LogoutEntity> getLogoutUsers() {
		List<LogoutEntity> logoutUsers = logoutRepository.findAll();
		System.out.println(logoutUsers);
		return logoutUsers;
	}
}
