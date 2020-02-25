package com.springtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.springtest.demo.controller", "com.springtest.demo.service"})
public class SpringCloudMicroserviceItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceItemApplication.class, args);
	}

}
