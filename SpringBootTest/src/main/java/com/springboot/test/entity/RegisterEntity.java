package com.springboot.test.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTER")
public class RegisterEntity {
	
	@Id
	@Column(nullable = true)
	String userName;
	
	@Column
	String email;
	
	@Column
	String firstName;
	
	@Column
	String lastName;
	
	@Column
	String loginUserType;
	
	@Column
	String loginPassword;

	@Column
	boolean passwordShow;
	
	@Column
	boolean rememberPassword;
	
	@Column
	Date createdDate;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginUserType() {
		return loginUserType;
	}

	public void setLoginUserType(String loginUserType) {
		this.loginUserType = loginUserType;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public boolean isPasswordShow() {
		return passwordShow;
	}

	public void setPasswordShow(boolean passwordShow) {
		this.passwordShow = passwordShow;
	}

	public boolean isRememberPassword() {
		return rememberPassword;
	}

	public void setRememberPassword(boolean rememberPassword) {
		this.rememberPassword = rememberPassword;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}