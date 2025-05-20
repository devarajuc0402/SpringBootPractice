package com.springboot.test.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class LoginEntity {
	
	@Id
	@Column(nullable = true)
	String userName;
	
	@Column
	String email;
	
	@Column
	String password;
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
