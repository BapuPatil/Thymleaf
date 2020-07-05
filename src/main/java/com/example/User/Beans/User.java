package com.example.User.Beans;

import java.sql.Date;

public class User {

	
	private int userId;
	private String userName;
	private int userAge;
	private int userPhone;
	private Date userDob;
	
	
	public User() {}
	
	public User(int userId, String userName, int userAge, int userPhone, Date userDob) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userDob = userDob;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public Date getUserDob() {
		return userDob;
	}
	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userPhone=" + userPhone
				+ ", userDob=" + userDob + "]";
	}
	
	
}
