package com.example.userprofileservice.userprofileservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userprofileservice.userprofileservice.entities.UserProfileData;
import com.example.userprofileservice.userprofileservice.respositories.UserProfileDataRepository;
import com.example.userprofileservice.userprofileservice.services.UserProfileDataService;

@Service
public class UserProfileDataServiceImpl implements UserProfileDataService{
	
	@Autowired
	private UserProfileDataRepository userProfileDataRepository;
	
	@Override
	public UserProfileData getUserProfile(String userId) {
		return this.userProfileDataRepository.findById(userId).orElse(null);
	}

	@Override
	public List<UserProfileData> getAllUserProfiles() {
		return this.userProfileDataRepository.findAll();
	}

	@Override
	public UserProfileData addUser(UserProfileData userProfileData) {
		String userProfileId = UUID.randomUUID().toString();
		userProfileData.setUserProfileId(userProfileId);
		return this.userProfileDataRepository.save(userProfileData);
	}

}
