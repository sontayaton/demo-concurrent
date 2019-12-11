package com.solutions.democoncurrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.solutions")
@Configuration
@EnableAutoConfiguration
public class DemoConcurrentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConcurrentApplication.class, args);
	}

}
