package com.example.healthdata.healthdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HealthdataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthdataserviceApplication.class, args);
	}

}
