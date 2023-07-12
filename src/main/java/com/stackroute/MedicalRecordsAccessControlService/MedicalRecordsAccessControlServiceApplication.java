package com.stackroute.MedicalRecordsAccessControlService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;



@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MedicalRecordsAccessControlServiceApplication {

	

	public static void main(String[] args) {

		System.out.println("Hello World , Srinivasan");

		SpringApplication.run(MedicalRecordsAccessControlServiceApplication.class, args);
	}

}
