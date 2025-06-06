package com.springboot.practice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springboot.practice.constants.Constant;
import com.springboot.practice.entity.RegisterEntity;

public class Utility {
	
	private static final Logger log = LoggerFactory.getLogger(Utility.class);

	public static String checkUserPassword(RegisterEntity request, RegisterEntity loginUser) {
		String result = Constant.USER_NOT_FOUND;
		if(request != null || loginUser != null) {
			String email = request.getEmail();
			String password = request.getLoginPassword();
			
			if(email != null && password != null) {
				String loginEmail = loginUser.getEmail();
				if(loginEmail != null) {
					if(loginEmail.equalsIgnoreCase(email)) {
						result = Constant.USER_FOUND;
						log.info(result);
						if(loginUser.getLoginPassword().equalsIgnoreCase(password)) {
							result = Constant.PASS_MATCHED;
							log.info(result);
							return result;
						} else {
							result = Constant.PASS_NOT_MATCHED;
							log.info(result);
							return result;
						}
					} else {
						result = Constant.USER_NOT_FOUND;
						log.info(result);
						return result;
					}
				}
			}
		}
		return result;
	}

}
