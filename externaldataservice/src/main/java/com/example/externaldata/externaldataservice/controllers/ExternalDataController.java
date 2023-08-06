package com.example.externaldataservice.externaldata.controllers;

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

import com.example.externaldata.externaldataservice.entities.ExternalData;
import com.example.externaldata.externaldataservice.services.ExternalDataService;


@RestController
@RequestMapping("/api/external-data")
public class ExternalDataController {
	
	@Autowired
	private ExternalDataService externalDataService;
	
	@PostMapping
	public ResponseEntity<ExternalData> createExternalData(@RequestBody ExternalData externalData){
		return ResponseEntity.status(HttpStatus.CREATED).body(externalDataService.createExternalData(externalData));
	}
	
	@GetMapping("/{externalDataId}")
	public ResponseEntity<ExternalData> getExternalDataByExternalId(@PathVariable String externalDataId){
		return ResponseEntity.status(HttpStatus.OK).body(externalDataService.getExternalDataByExternalDataId(externalDataId));
	}
	
	@GetMapping
	public ResponseEntity<List<ExternalData>> getAllExceptionData(){
		return ResponseEntity.ok(externalDataService.getAllExternalData());
	}
	
	

}
