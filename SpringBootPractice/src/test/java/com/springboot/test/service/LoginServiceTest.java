package com.springboot.test.service;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.lenient;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.springboot.practice.entity.LoginEntity;
import com.springboot.practice.repository.LoginRepository;
import com.springboot.practice.service.LoginService;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class LoginServiceTest {
	
	@Mock
	LoginRepository loginRepository;
	
	@InjectMocks
	LoginService loginService;
	
	@Test
	public void getLoginUsersNullTest() {
		List<LoginEntity> loginUsers = null;
		lenient().when(loginRepository.findAll()).thenReturn(loginUsers);
		assertNull(loginUsers);
	}
}
