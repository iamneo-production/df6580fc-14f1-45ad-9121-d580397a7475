package com.example.notifications.notificationsservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notifications.notificationsservice.entities.Notification;
import com.example.notifications.notificationsservice.services.NotificationService;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	//add notifications
	@PostMapping
	public Notification addNotification(@RequestBody Notification notification) {
		return notificationService.addNotification(notification);
	}
	
	//get 1 notification by notificationId
	@GetMapping("/{notificationId}")
	public Notification getNotificationById(@PathVariable String notificationId) {
		return notificationService.getNotificationByNotificationId(notificationId);
	}
	
	//get 1 notification by analyticsId
	@GetMapping("/analytics/{analyticsId}")
	public List<Notification> getNotificationByAnalyticsId(@PathVariable String analyticsId) {
		return notificationService.getNotificationByAnalyticsId(analyticsId);
	}
	
	@GetMapping("/user-profile/{userProfileId}")
	public List<Notification> getNotificationByUserProfileId(@PathVariable String userProfileId) {
		return notificationService.getNotificationByUserProfileId(userProfileId);
	}
	@GetMapping
	public List<Notification> getAllNotifications(){
		return notificationService.getAllNotifications();
	}

}
