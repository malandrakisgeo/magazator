package com.gmala.magazator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
public class MagazatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagazatorApplication.class, args);
	}

}
