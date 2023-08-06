package com.example.notifications.notificationsservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notifications.notificationsservice.entities.Analytics;
import com.example.notifications.notificationsservice.entities.Notification;
import com.example.notifications.notificationsservice.external.services.AnalyticsService;
import com.example.notifications.notificationsservice.repositories.NotificationRepository;
import com.example.notifications.notificationsservice.services.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	NotificationRepository notificationRepository;
	
	@Autowired
	AnalyticsService analyticsService;
	
	@Override
	public Notification addNotification(Notification notification) {
		String notificationId = UUID.randomUUID().toString();
		notification.setNotificationId(notificationId);
		//set the message
		Analytics analytics = analyticsService.getAnalytics(notification.getAnalyticsId());
		String message = "";
		if(analytics!=null) {
			if(analytics.getBmi()!= 0 && analytics.getWeatherImpactIndex()!=0) {
				message+="User BMI is "+analytics.getBmi()+" & Weather Impact Index is "+analytics.getWeatherImpactIndex();
			}
			else if(analytics.getBmi()!= 0){
				message+="User BMI is "+analytics.getBmi();
			}
			else if(analytics.getWeatherImpactIndex()!=0) {
				message+="Weather Impact Index is "+analytics.getWeatherImpactIndex();
			}
			else {
				message+="No details Found";
			}
		}
		notification.setMessage(message);
		
		return notificationRepository.save(notification);
	}

	@Override
	public List<Notification> getAllNotifications() {
		return notificationRepository.findAll();
	}

	@Override
	public Notification getNotificationByNotificationId(String notificationId) {
		return notificationRepository.findById(notificationId).orElse(null);
	}

	@Override
	public List<Notification> getNotificationByAnalyticsId(String analyticsId) {
		return notificationRepository.findByAnalyticsId(analyticsId);

	}

	@Override
	public List<Notification> getNotificationByUserProfileId(String userProfileId) {
		return notificationRepository.findByUserProfileId(userProfileId);
	}

}
