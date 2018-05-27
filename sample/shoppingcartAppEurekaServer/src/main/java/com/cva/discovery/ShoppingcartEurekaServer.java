package com.cva.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingcartEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartEurekaServer.class, args);
	}
}
