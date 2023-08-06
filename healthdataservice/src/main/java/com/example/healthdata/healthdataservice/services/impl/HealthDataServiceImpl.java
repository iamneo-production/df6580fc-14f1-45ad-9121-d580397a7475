package com.example.healthdata.healthdataservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.healthdata.healthdataservice.entities.HealthData;
import com.example.healthdata.healthdataservice.exceptions.ResourceNotFoundException;
import com.example.healthdata.healthdataservice.repositories.HealthDataRepository;
import com.example.healthdata.healthdataservice.services.HealthDataService;

@Service
public class HealthDataServiceImpl implements HealthDataService {
	
	@Autowired
	private HealthDataRepository healthDataRepository;
	
	@Override
	public HealthData createHealthData(HealthData healthData) {
		String healthDatId = UUID.randomUUID().toString();
		healthData.setHealthDataId(healthDatId);
		return healthDataRepository.save(healthData);
	}

	@Override
	public List<HealthData> getAllHealthData() {
		return healthDataRepository.findAll();
	}

	@Override
	public HealthData getHealthDataByHealthId(String healthId) {
		return healthDataRepository.findById(healthId).orElseThrow(() -> new ResourceNotFoundException("Health Data with given Health Id not found !!"));
	}

	@Override
	public List<HealthData> getHealthDataByUserId(String userProfileId) {
		return healthDataRepository.findByUserProfileId(userProfileId);
	}

}
