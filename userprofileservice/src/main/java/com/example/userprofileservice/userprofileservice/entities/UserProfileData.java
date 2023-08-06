package com.example.userprofileservice.userprofileservice.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "userprofiledata")
public class UserProfileData {
	
	@Id
	private String userProfileId;
	private String userName;
	private String sex;
	private int age;
	
	@Transient
	List<Notification> notifications = new ArrayList<>();

	public UserProfileData() {
		super();
	}

	public UserProfileData(String userProfileId, String userName, String sex, int age,
			List<Notification> notifications) {
		super();
		this.userProfileId = userProfileId;
		this.userName = userName;
		this.sex = sex;
		this.age = age;
		this.notifications = notifications;
	}

	public String getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	@Override
	public String toString() {
		return "UserProfileData [userProfileId=" + userProfileId + ", userName=" + userName + ", sex=" + sex + ", age="
				+ age + ", notifications=" + notifications + "]";
	}

	
	
	

}
