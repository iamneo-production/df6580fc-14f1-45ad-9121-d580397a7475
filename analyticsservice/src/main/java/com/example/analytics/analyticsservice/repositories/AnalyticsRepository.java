package com.example.analytics.analyticsservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.analytics.analyticsservice.entities.Analytics;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, String>{
	
	
	List<Analytics> findByHealthDataId(String healthDataId);
	
	List<Analytics> findByExternalDataId(String externalDataId);
	
	List<Analytics> findByUserProfileId(String userProfileId);
}
