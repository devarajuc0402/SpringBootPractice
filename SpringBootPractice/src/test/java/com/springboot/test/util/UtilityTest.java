package com.springboot.test.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springboot.practice.constants.Constant;
import com.springboot.practice.entity.RegisterEntity;
import com.springboot.practice.util.Utility;

@ExtendWith(MockitoExtension.class)
public class UtilityTest {
	
	@Test
	void checkUserPasswordUserNotFoundTest() {
		RegisterEntity request = new RegisterEntity();
		RegisterEntity loginUser = new RegisterEntity();
		String response = Utility.checkUserPassword(request, loginUser);
		assertEquals(Constant.USER_NOT_FOUND, response);
	}
}
