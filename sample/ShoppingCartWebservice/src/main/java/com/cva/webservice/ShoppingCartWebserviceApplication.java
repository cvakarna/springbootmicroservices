package com.cva.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cva.webservice.controller.UserWebServiceController;
import com.cva.webservice.userservice.ProductRemoteService;
import com.cva.webservice.userservice.RemoteUSerService;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingCartWebserviceApplication {

	public static final String USERS_SERVICE_URL = "http://USERS-SERVICE";
	public static final String PRODUCT_SERVICE_URL = "http://PRODUCTS-SERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartWebserviceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public RemoteUSerService remoteUserService()
	{
		return new RemoteUSerService(USERS_SERVICE_URL);
	}
	
	@Bean
	public ProductRemoteService productRemoteService()
	{
		return new ProductRemoteService(PRODUCT_SERVICE_URL);
	}
	
	
}
