package com.example.analytics.analyticsservice.entities;

public class ExternalData {
	
	private String externalDataId;
	private float temperature;
	private float humidity;
	private float airQualityIndex;
	public ExternalData() {
		super();
		
	}
	public ExternalData(String externalDataId, float temperature, float humidity, float airQualityIndex) {
		super();
		this.externalDataId = externalDataId;
		this.temperature = temperature;
		this.humidity = humidity;
		this.airQualityIndex = airQualityIndex;
	}
	public String getExternalDataId() {
		return externalDataId;
	}
	public void setExternalDataId(String externalDataId) {
		this.externalDataId = externalDataId;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getAirQualityIndex() {
		return airQualityIndex;
	}
	public void setAirQualityIndex(float airQualityIndex) {
		this.airQualityIndex = airQualityIndex;
	}
	@Override
	public String toString() {
		return "ExternalData [externalDataId=" + externalDataId + ", temperature=" + temperature + ", humidity="
				+ humidity + ", airQualityIndex=" + airQualityIndex + "]";
	}
	
	

}
