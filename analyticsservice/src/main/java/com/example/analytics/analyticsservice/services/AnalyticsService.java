package com.example.analytics.analyticsservice.services;

import java.util.List;

import com.example.analytics.analyticsservice.entities.Analytics;


public interface AnalyticsService {
	
	Analytics createAnalytics(Analytics analytics);
	
	List<Analytics> getAllAnalytics();
	
	Analytics getAnalyticsByAnalyticsId(String analyticsId);
	
	List<Analytics> getAnalyticsByHealthDataId(String healthDataId);
	
	List<Analytics> getAnalyticsByExternalDataId(String externalDataId);
	
	List<Analytics> getAnalyticsByUserProfileId(String userProfileId);

}
