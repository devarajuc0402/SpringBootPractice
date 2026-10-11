package com.springboot.practice.entity;

import java.sql.Timestamp;

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
	String loginUserType = "viewer";
	
	@Column
	String loginPassword;

	@Column
	boolean passwordShow = false;
	
	@Column
	boolean rememberPassword = false;
	
	@Column
	Timestamp createdDate = new Timestamp(System.currentTimeMillis());

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

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "RegisterEntity [userName=" + userName + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", loginUserType=" + loginUserType + ", loginPassword=" + loginPassword + ", passwordShow="
				+ passwordShow + ", rememberPassword=" + rememberPassword + ", createdDate=" + createdDate + "]";
	}

}