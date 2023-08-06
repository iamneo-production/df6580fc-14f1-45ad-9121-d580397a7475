package com.example.healthdata.healthdataservice.services;

import java.util.List;

import com.example.healthdata.healthdataservice.entities.HealthData;

public interface HealthDataService {
	
	HealthData createHealthData(HealthData healthData);
	
	List<HealthData> getAllHealthData();
	
	HealthData getHealthDataByHealthId(String healthId);
	
	List<HealthData> getHealthDataByUserId(String userId);
}
