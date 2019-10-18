package com.project.noteapplicationeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NoteApplicationEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteApplicationEurekaServerApplication.class, args);
	}

}
