package com.example.userprofileservice.userprofileservice.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.userprofileservice.userprofileservice.entities.Notification;


@FeignClient(name = "NOTIFICATION-SERVICE")
public interface NotificationService {
	
	@GetMapping("/api/notifications/user-profile/{userProfileId}")
	List<Notification> getNotificationsByUserProfileId(@PathVariable("userProfileId") String userProfileId);
}
