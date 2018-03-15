package com.docker.example.hesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HesServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(HesServiceApplication.class, args);
	}
}
