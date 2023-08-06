package com.example.externaldata.externaldataservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.externaldata.externaldataservice.entities.ExternalData;

@Repository
public interface ExternalDataRepository extends JpaRepository<ExternalData, String>{

}
