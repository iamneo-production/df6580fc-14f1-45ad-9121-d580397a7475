package com.example.analytics.analyticsservice.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.analytics.analyticsservice.entities.HealthData;

@FeignClient(name = "HEALTHDATA-SERVICE")
public interface HealthDataService {
	
	@GetMapping("/api/health-data/{healthDataId}")
	HealthData getHealthData(@PathVariable("healthDataId") String healthDataId);

}
