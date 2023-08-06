package com.example.userprofileservice.userprofileservice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userprofileservice.userprofileservice.entities.UserProfileData;

@Repository
public interface UserProfileDataRepository extends JpaRepository<UserProfileData, String>{

}


