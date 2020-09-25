package com.projekat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Aplikacija {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Aplikacija.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Aplikacija.class, args);
	}

}
