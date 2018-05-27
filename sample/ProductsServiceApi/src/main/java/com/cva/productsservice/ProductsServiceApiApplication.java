package com.cva.productsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.cva"})
public class ProductsServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsServiceApiApplication.class, args);
	}
}
