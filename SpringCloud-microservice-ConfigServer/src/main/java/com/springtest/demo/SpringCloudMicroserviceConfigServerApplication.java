package com.springtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudMicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceConfigServerApplication.class, args);
	}

}
