package com.docker.example.dbservice;


import com.docker.example.dbservice.service.CityService;
import com.docker.example.dbservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableJpaRepositories( basePackages= "com.docker.example.dbservice.service")
@EnableEurekaClient
@SpringBootApplication
public class DbServiceApplication {
	@Autowired
	private CityService cityService;
	@Autowired
	private CountryService countryService;
	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}
}
