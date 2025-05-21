package com.springboot.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.LoginEntity;
import com.springboot.test.repository.LoginRepository;
import com.springboot.test.response.CustomResponse;

import constants.Constant;
import util.Utility;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public List<LoginEntity> getLoginUsers() {
		List<LoginEntity> loginUsers = loginRepository.findAll();
		System.out.println(loginUsers);
		return loginUsers;
	}
	
	public CustomResponse loginUser(LoginEntity request) {
		String validate = checkUserExist(request);
		CustomResponse customResponse = new CustomResponse();
		customResponse.setReponseName("Login");
		customResponse.setPayload(validate);
		System.out.println(validate);
		return customResponse;
	}

	private String checkUserExist(LoginEntity request) {
		String email = request.getEmail();
		Optional<LoginEntity> loginUser = loginRepository.findByEmail(email);
		if(loginUser == null) {
			return Constant.USER_NOT_FOUND;
		}
		String validate = Utility.checkUserPassword(request, loginUser.get());
		String result = Constant.EMPTY;
		
		if(validate.equalsIgnoreCase(Constant.PASS_MATCHED)) {
			result = email+" "+Constant.LOGGED_IN;
		} else if(validate.equalsIgnoreCase(Constant.PASS_NOT_MATCHED)) {
			result = Constant.PASS_NOT_MATCHED;
		} else {
			result = Constant.USER_NOT_FOUND;
		}
		return result;
	}
}
