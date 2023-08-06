package com.example.notifications.notificationsservice.services;

import java.util.List;

import com.example.notifications.notificationsservice.entities.Notification;

public interface NotificationService {
	
	Notification addNotification(Notification notification);
	
	List<Notification> getAllNotifications();

	Notification getNotificationByNotificationId(String notificationId);

	List<Notification> getNotificationByAnalyticsId(String analyticsId);
	
	List<Notification> getNotificationByUserProfileId(String userProfileId);
}
