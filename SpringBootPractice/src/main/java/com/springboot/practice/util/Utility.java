package com.springboot.practice.util;

import com.springboot.practice.constants.Constant;
import com.springboot.practice.entity.RegisterEntity;

public class Utility {

	public static String checkUserPassword(RegisterEntity request, RegisterEntity loginUser) {
		String email = request.getEmail();
		String password = request.getLoginPassword();
		String result = Constant.EMPTY;
		
		if(loginUser.getEmail().equalsIgnoreCase(email)) {
			result = Constant.USER_FOUND;
			System.out.println(result);
			if(loginUser.getLoginPassword().equalsIgnoreCase(password)) {
				result = Constant.PASS_MATCHED;
				System.out.println(result);
				return result;
			} else {
				result = Constant.PASS_NOT_MATCHED;
				System.out.println(result);
				return result;
			}
		} else {
			result = Constant.USER_NOT_FOUND;
			System.out.println(result);
			return result;
		}
	}

}
