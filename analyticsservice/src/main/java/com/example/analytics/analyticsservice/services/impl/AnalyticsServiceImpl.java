package com.example.analytics.analyticsservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.analytics.analyticsservice.entities.Analytics;
import com.example.analytics.analyticsservice.entities.ExternalData;
import com.example.analytics.analyticsservice.entities.HealthData;
import com.example.analytics.analyticsservice.exceptions.ResourceNotFoundException;
import com.example.analytics.analyticsservice.external.services.ExternalDataService;
import com.example.analytics.analyticsservice.external.services.HealthDataService;
import com.example.analytics.analyticsservice.repositories.AnalyticsRepository;
import com.example.analytics.analyticsservice.services.AnalyticsService;

@Service
public class AnalyticsServiceImpl implements AnalyticsService{
	
	@Autowired
	private AnalyticsRepository analyticsRepository;
	
	@Autowired
	private HealthDataService healthDataService;
	
	@Autowired
	private ExternalDataService externalDataService;
	
	@Override
	public Analytics createAnalytics(Analytics analytics) {
		// TODO Auto-generated method stub
		String analyticsId = UUID.randomUUID().toString();
		analytics.setAnalyticsId(analyticsId);
		
		//call healthdata
		HealthData healthData = healthDataService.getHealthData(analytics.getHealthDataId());
		if(healthData!=null) {
			float userBmi = healthData.getWeight()/(healthData.getHeight()*healthData.getHeight());
			analytics.setBmi(userBmi);
		}
		
		//call external data
		ExternalData externalData = externalDataService.getExternalData(analytics.getExternalDataId());
		if(externalData!=null) {
			float healthIndex = (externalData.getTemperature()*externalData.getHumidity())/(externalData.getAirQualityIndex()+1);
			analytics.setWeatherImpactIndex(healthIndex);
		}
		return analyticsRepository.save(analytics);
	}

	@Override
	public List<Analytics> getAllAnalytics() {
		// TODO Auto-generated method stub
		return analyticsRepository.findAll();
	}

	@Override
	public Analytics getAnalyticsByAnalyticsId(String analyticsId) {
		// TODO Auto-generated method stub
		return analyticsRepository.findById(analyticsId).orElseThrow(() -> new ResourceNotFoundException("Analytics with given Analytics Id not found !!"));
	}

	@Override
	public List<Analytics> getAnalyticsByHealthDataId(String healthDataId) {
		// TODO Auto-generated method stub
		return analyticsRepository.findByHealthDataId(healthDataId);
	}

	@Override
	public List<Analytics> getAnalyticsByExternalDataId(String externalDataId) {
		// TODO Auto-generated method stub
		return analyticsRepository.findByExternalDataId(externalDataId);
	}

	@Override
	public List<Analytics> getAnalyticsByUserProfileId(String userProfileId) {
		// TODO Auto-generated method stub
		return analyticsRepository.findByUserProfileId(userProfileId);
	}

}
