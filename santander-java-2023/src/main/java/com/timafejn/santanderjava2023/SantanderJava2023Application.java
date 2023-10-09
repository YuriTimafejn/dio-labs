package com.timafejn.santanderjava2023;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(servers = { @Server( url = "/")})
public class SantanderJava2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderJava2023Application.class, args);
	}

}
