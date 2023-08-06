package com.example.healthdata.healthdataservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "healthdata")
public class HealthData {
	
	@Id
	private String healthDataId;
	private String userProfileId;
	private float weight;
	private float height;
	public HealthData() {
		super();
	}
	public HealthData(String healthDataId, String userProfileId, float weight, float height) {
		super();
		this.healthDataId = healthDataId;
		this.userProfileId = userProfileId;
		this.weight = weight;
		this.height = height;
	}
	public String getHealthDataId() {
		return healthDataId;
	}
	public void setHealthDataId(String healthDataId) {
		this.healthDataId = healthDataId;
	}
	public String getUserProfileId() {
		return userProfileId;
	}
	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
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
		return "HealthData [healthDataId=" + healthDataId + ", userProfileId=" + userProfileId + ", weight=" + weight
				+ ", height=" + height + "]";
	}
	
	
	
	
	
	

}

