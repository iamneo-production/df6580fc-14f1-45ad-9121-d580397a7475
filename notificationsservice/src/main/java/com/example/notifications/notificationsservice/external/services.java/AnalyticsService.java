package com.example.notifications.notificationsservice.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.notifications.notificationsservice.entities.Analytics;


@FeignClient(name = "ANALYTICS-SERVICE")
public interface AnalyticsService {
	
	@GetMapping("/api/analytics/{analyticsId}")
	Analytics getAnalytics(@PathVariable("analyticsId") String analyticsId);

}
