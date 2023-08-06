package com.example.analytics.analyticsservice.entities;

public class HealthData {
	
	private String healthDataId;
	private String userId;
	private float weight;
	private float height;
	public HealthData() {
		super();
		
	}
	public HealthData(String healthDataId, String userId, float weight, float height) {
		super();
		this.healthDataId = healthDataId;
		this.userId = userId;
		this.weight = weight;
		this.height = height;
	}
	public String getHealthDataId() {
		return healthDataId;
	}
	public void setHealthDataId(String healthDataId) {
		this.healthDataId = healthDataId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "HealthData [healthDataId=" + healthDataId + ", userId=" + userId + ", weight=" + weight + ", height="
				+ height + "]";
	}
	
	
	
}
