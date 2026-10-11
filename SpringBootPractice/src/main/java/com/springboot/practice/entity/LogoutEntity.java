package com.springboot.practice.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGOUT")
public class LogoutEntity {
	
	@Id
	@Column(nullable = true)
	String userName;
	
	@Column
	String email;
	
	@Column
	String loginUserType = "viewer";
	
	@Column
	Timestamp lastLoginDate = new Timestamp(System.currentTimeMillis());;

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

	public String getLoginUserType() {
		return loginUserType;
	}

	public void setLoginUserType(String loginUserType) {
		this.loginUserType = loginUserType;
	}

	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "LogoutEntity [userName=" + userName + ", email=" + email + ", loginUserType=" + loginUserType
				+ ", lastLoginDate=" + lastLoginDate + "]";
	}

}
