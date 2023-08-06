package com.example.externaldata.externaldataservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.externaldata.externaldataservice.entities.ExternalData;
import com.example.externaldata.externaldataservice.exceptions.ResourceNotFoundException;
import com.example.externaldata.externaldataservice.repositories.ExternalDataRepository;
import com.example.externaldata.externaldataservice.services.ExternalDataService;

@Service
public class ExternalDataServiceImpl implements ExternalDataService{
	
	@Autowired
	private ExternalDataRepository externalDataRepository;

	@Override
	public ExternalData createExternalData(ExternalData externalData) {
		// TODO Auto-generated method stub
		String externalDataId = UUID.randomUUID().toString();
		externalData.setExternalDataId(externalDataId);
		return externalDataRepository.save(externalData);
	}

	@Override
	public List<ExternalData> getAllExternalData() {
		// TODO Auto-generated method stub
		return externalDataRepository.findAll();
	}

	@Override
	public ExternalData getExternalDataByExternalDataId(String externalDataId) {
		// TODO Auto-generated method stub
		return externalDataRepository.findById(externalDataId).orElseThrow(() -> new ResourceNotFoundException("External Data with given External Data Id not found !!"));
	}

}
