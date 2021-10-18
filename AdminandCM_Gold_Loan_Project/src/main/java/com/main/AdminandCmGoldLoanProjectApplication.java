package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdminandCmGoldLoanProjectApplication {

	public static void main(String[] args) {
		System.out.println("admin and cm");
		SpringApplication.run(AdminandCmGoldLoanProjectApplication.class, args);
	}

}
