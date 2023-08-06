package com.example.notifications.notificationsservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notifications.notificationsservice.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, String>{
	
	List<Notification> findByAnalyticsId(String analyticsId);
	
	List<Notification> findByUserProfileId(String userProfileId);
}
