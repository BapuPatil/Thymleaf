package com.example.User.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_age")
	private int userAge;
	
	@Column(name="user_phone")
	private int userPhone;
	
	@Column(name="user_dob")
	private Date userDob;

	public UserEntity() {}
	
	
	public UserEntity(int userId, String userName, int userAge, int userPhone, Date userDob) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userDob = userDob;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
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
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userPhone="
				+ userPhone + ", userDob=" + userDob + "]";
	}

}
