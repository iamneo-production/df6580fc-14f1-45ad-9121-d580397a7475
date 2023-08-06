package com.example.healthdata.healthdataservice.controllers;

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

import com.example.healthdata.healthdataservice.entities.HealthData;
import com.example.healthdata.healthdataservice.services.HealthDataService;

@RestController
@RequestMapping("/api/health-data")
public class HealthDataController {
	
	@Autowired
	private HealthDataService healthDataService;
	
	@PostMapping
	public ResponseEntity<HealthData> createHealthData(@RequestBody HealthData healthData){
		return ResponseEntity.status(HttpStatus.CREATED).body(healthDataService.createHealthData(healthData));
	}
	
	@GetMapping("/{healthDataId}")
	public ResponseEntity<HealthData> getHealthDataByHealthId(@PathVariable String healthDataId){
		return ResponseEntity.status(HttpStatus.OK).body(healthDataService.getHealthDataByHealthId(healthDataId));
	}
	
	@GetMapping("/user/{userProfileId}")
	public ResponseEntity<List<HealthData>> getHealthDataByUserId(@PathVariable String userProfileId){
		return ResponseEntity.status(HttpStatus.OK).body(healthDataService.getHealthDataByUserId(userProfileId));
	}
	
	@GetMapping
	public ResponseEntity<List<HealthData>> getAllHealthData(){
		return ResponseEntity.ok(healthDataService.getAllHealthData());
	}

}
