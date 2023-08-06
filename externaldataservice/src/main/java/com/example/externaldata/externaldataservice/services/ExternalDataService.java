package com.example.externaldata.externaldataservice.services;

import java.util.List;

import com.example.externaldata.externaldataservice.entities.ExternalData;


public interface ExternalDataService {
	
	ExternalData createExternalData(ExternalData externalData);
	
	List<ExternalData> getAllExternalData();
	
	ExternalData getExternalDataByExternalDataId(String externalDataId);
	
}
