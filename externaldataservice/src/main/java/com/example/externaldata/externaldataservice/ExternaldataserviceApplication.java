package com.example.externaldata.externaldataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ExternaldataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternaldataserviceApplication.class, args);
	}

}
