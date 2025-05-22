package com.springboot.practice.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class LoginEntity {
	
	@Id
	@Column(nullable = true)
	Long id;
	
	@Column(nullable = true)
	String userName;
	
	@Column
	String email;
	
	@Column
	String loginPassword;

	@Column
	String loginUserType;

	@Column
	boolean passwordShow;
	
	@Column
	boolean rememberPassword;
	
	@Column
	Timestamp createdDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginUserType() {
		return loginUserType;
	}

	public void setLoginUserType(String loginUserType) {
		this.loginUserType = loginUserType;
	}

	public boolean isPasswordShow() {
		return passwordShow;
	}

	public void setPasswordShow(boolean passwordShow) {
		this.passwordShow = passwordShow;
	}

	public boolean getRememberPassword() {
		return rememberPassword;
	}

	public void setRememberPassword(boolean rememberPassword) {
		this.rememberPassword = rememberPassword;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}
