package com.springboot.practice.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.springboot.practice.constants.Constant;
import com.springboot.practice.entity.LoginEntity;
import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.repository.LoginRepository;
import com.springboot.practice.repository.RegisterRepository;
import com.springboot.practice.response.CustomResponse;
import com.springboot.practice.util.Utility;

@Service
public class LoginService {

	public Optional<RegisterEntity> registerPayload = null;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	RegisterRepository registerRepository;
	
	public List<LoginEntity> getLoginUsers() {
		List<LoginEntity> loginUsers = loginRepository.findAll();
		System.out.println(loginUsers);
		return loginUsers;
	}
	
	@Async
	public CompletableFuture<CustomResponse> loginUser(RegisterEntity request) {
		CustomResponse customResponse = new CustomResponse();
		try {
			Thread.sleep(3000);
			String validate = checkUserExist(request);
			if(validate.contains(Constant.LOGGED_IN)) {
				LoginEntity mapLogin = mapLoginEntity(registerPayload.get());
				LoginEntity login = loginRepository.save(mapLogin);
				validate = validate +" - "+ login;
			}
			customResponse.setReponseName("Login");
			customResponse.setPayload(validate);
			System.out.println(validate);
		} catch (InterruptedException e) {
			customResponse.setReponseName("Login");
			customResponse.setReponseName(e.toString());
            Thread.currentThread().interrupt();
        } catch (Exception e) {
			customResponse.setReponseName("Login");
			customResponse.setReponseName(e.toString());
		}
		return CompletableFuture.completedFuture(customResponse);
	}

	private LoginEntity mapLoginEntity(RegisterEntity register) {
		LoginEntity request = new LoginEntity();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		request.setCreatedDate(timestamp);
		request.setEmail(register.getEmail());
		request.setLoginPassword(register.getLoginPassword());
		request.setLoginUserType(register.getLoginUserType());
		request.setPasswordShow(false);
		request.setRememberPassword(false);
		request.setUserName(register.getUserName());
		return request;
	}

	private String checkUserExist(RegisterEntity request) {
		String email = request.getEmail();
		registerPayload = registerRepository.findByEmail(email);
		if(registerPayload == null) {
			return Constant.USER_NOT_FOUND;
		}
		String validate = Utility.checkUserPassword(request, registerPayload.get());
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
