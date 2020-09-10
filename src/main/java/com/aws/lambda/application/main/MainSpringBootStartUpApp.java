package com.aws.lambda.application.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.aws.lambda"})
public class MainSpringBootStartUpApp {
	public static void main(String[] args) {		
		SpringApplication.run(MainSpringBootStartUpApp.class, args);
	}
}