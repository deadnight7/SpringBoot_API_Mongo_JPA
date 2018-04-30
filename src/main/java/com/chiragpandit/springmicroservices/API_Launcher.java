package com.chiragpandit.springmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class API_Launcher {

	public static void main(String[] args) {
		SpringApplication.run(API_Launcher.class, args);
		//System.out.println("Mongo URI" +System.getenv("MONGODB_URI"));
	}

}
