package com.example.healthdata.healthdataservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.healthdata.healthdataservice.entities.HealthData;

public interface HealthDataRepository extends JpaRepository<HealthData, String>{
	
	List<HealthData> findByUserProfileId(String userId);
}

