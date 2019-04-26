package com.griffiths.hugh.spring.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@Configuration
@EnableWebSecurity
public class InitApplication {
	public static void main(final String[] args) {
		SpringApplication.run(InitApplication.class, args);
	}

}
