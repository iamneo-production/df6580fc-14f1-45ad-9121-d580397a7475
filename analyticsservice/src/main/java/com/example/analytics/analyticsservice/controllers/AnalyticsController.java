package com.example.analytics.analyticsservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.analytics.analyticsservice.entities.Analytics;
import com.example.analytics.analyticsservice.services.AnalyticsService;



@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
	
	@Autowired
	private AnalyticsService analyticsService;
	
	@PostMapping
	public ResponseEntity<Analytics> createAnalytics(@RequestBody Analytics analytics){
		return ResponseEntity.status(HttpStatus.CREATED).body(analyticsService.createAnalytics(analytics));
	}
	
	@GetMapping("/{analyticsId}")
	public ResponseEntity<Analytics> getAnalyticsByAnalyticsId(@PathVariable String analyticsId){
		return ResponseEntity.status(HttpStatus.OK).body(analyticsService.getAnalyticsByAnalyticsId(analyticsId));
	}
	
	@GetMapping("/user-profile/{userProfileId}")
	public ResponseEntity<List<Analytics>> getAnalyticsaByUserProfileId(@PathVariable String userProfileId){
		return ResponseEntity.status(HttpStatus.OK).body(analyticsService.getAnalyticsByUserProfileId(userProfileId));
	}
	
	@GetMapping("/external-data/{externalDataId}")
	public ResponseEntity<List<Analytics>> getAnalyticsaByExternalDataId(@PathVariable String externalDataId){
		return ResponseEntity.status(HttpStatus.OK).body(analyticsService.getAnalyticsByExternalDataId(externalDataId));
	}
	@GetMapping("/health-data/{healthDataId}")
	public ResponseEntity<List<Analytics>> getAnalyticsByHealthDataId(@PathVariable String healthDataId){
		return ResponseEntity.status(HttpStatus.OK).body(analyticsService.getAnalyticsByHealthDataId(healthDataId));
	}
	
	@GetMapping
	public ResponseEntity<List<Analytics>> getAllAnalytics(){
		return ResponseEntity.ok(analyticsService.getAllAnalytics());
	}

}
