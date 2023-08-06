package com.example.notifications.notificationsservice.entities;

public class Analytics {
	
	private String analyticsId;
	
	private String healthDataId;
	
	private String externalDataId;
	
	private String userProfileId;
	
	private float bmi;
	
	private float weatherImpactIndex;

	public Analytics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Analytics(String analyticsId, String healthDataId, String externalDataId, String userProfileId, float bmi,
			float weatherImpactIndex) {
		super();
		this.analyticsId = analyticsId;
		this.healthDataId = healthDataId;
		this.externalDataId = externalDataId;
		this.userProfileId = userProfileId;
		this.bmi = bmi;
		this.weatherImpactIndex = weatherImpactIndex;
	}

	public String getAnalyticsId() {
		return analyticsId;
	}

	public void setAnalyticsId(String analyticsId) {
		this.analyticsId = analyticsId;
	}

	public String getHealthDataId() {
		return healthDataId;
	}

	public void setHealthDataId(String healthDataId) {
		this.healthDataId = healthDataId;
	}

	public String getExternalDataId() {
		return externalDataId;
	}

	public void setExternalDataId(String externalDataId) {
		this.externalDataId = externalDataId;
	}

	public String getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}

	public float getBmi() {
		return bmi;
	}

	public void setBmi(float bmi) {
		this.bmi = bmi;
	}

	public float getWeatherImpactIndex() {
		return weatherImpactIndex;
	}

	public void setWeatherImpactIndex(float weatherImpactIndex) {
		this.weatherImpactIndex = weatherImpactIndex;
	}

	@Override
	public String toString() {
		return "Analytics [analyticsId=" + analyticsId + ", healthDataId=" + healthDataId + ", externalDataId="
				+ externalDataId + ", userProfileId=" + userProfileId + ", bmi=" + bmi + ", weatherImpactIndex="
				+ weatherImpactIndex + "]";
	}
	
	
}
