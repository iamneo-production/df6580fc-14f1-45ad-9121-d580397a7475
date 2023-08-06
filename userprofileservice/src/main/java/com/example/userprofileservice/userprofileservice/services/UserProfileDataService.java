package com.example.userprofileservice.userprofileservice.services;

import java.util.List;

import com.example.userprofileservice.userprofileservice.entities.UserProfileData;

public interface UserProfileDataService {
	
	public UserProfileData getUserProfile(String userId);

	public List<UserProfileData> getAllUserProfiles();

	public UserProfileData addUser(UserProfileData userProfileData);
}

