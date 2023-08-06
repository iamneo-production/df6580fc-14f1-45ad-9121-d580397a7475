package com.example.notifications.notificationsservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notification")
public class Notification {
	
	@Id
	private String notificationId;
	
	private String analyticsId;
	
	private String userProfileId;
	
	private String message;

	public Notification() {
		super();
		
	}

	public Notification(String notificationId, String analyticsId, String userProfileId, String message) {
		super();
		this.notificationId = notificationId;
		this.analyticsId = analyticsId;
		this.userProfileId = userProfileId;
		this.message = message;
	}

	public String getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getAnalyticsId() {
		return analyticsId;
	}

	public void setAnalyticsId(String analyticsId) {
		this.analyticsId = analyticsId;
	}

	public String getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", analyticsId=" + analyticsId + ", userProfileId="
				+ userProfileId + ", message=" + message + "]";
	}

	
	
}
