package com.example.analytics.analyticsservice.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.analytics.analyticsservice.entities.ExternalData;

@FeignClient(name = "EXTERNALDATA-SERVICE")
public interface ExternalDataService {
	
	@GetMapping("/api/external-data/{externalDataId}")
	ExternalData getExternalData(@PathVariable("externalDataId") String externalDataId);

}
