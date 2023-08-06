package com.example.userprofileservice.userprofileservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userprofileservice.userprofileservice.entities.UserProfileData;
import com.example.userprofileservice.userprofileservice.services.UserProfileDataService;

@RestController
@RequestMapping("/api/user-profile")
public class UserProfileDataController {
	
	@Autowired
	private UserProfileDataService userProfileDataService;
	
	@PostMapping
	public UserProfileData addUser(@RequestBody UserProfileData userProfileData) {
		return this.userProfileDataService.addUser(userProfileData);
	}
	
	//get all user
	@GetMapping
	public List<UserProfileData> getAllUsers(){
		
		return this.userProfileDataService.getAllUserProfiles();
	}
	
	
	//get user by id
	@GetMapping("/userProfile/{userId}")
	public UserProfileData getUserProfile(@PathVariable String userId) {
		
		return this.userProfileDataService.getUserProfile(userId);
		
	}

}
