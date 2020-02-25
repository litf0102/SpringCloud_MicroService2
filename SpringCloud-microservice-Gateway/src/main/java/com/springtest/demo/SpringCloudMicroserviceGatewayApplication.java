package com.springtest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan(basePackages = "com.springtest.demo.filter")
public class SpringCloudMicroserviceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroserviceGatewayApplication.class, args);
	}

}
