package com.cva.webservice.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ProductRemoteService {

	protected String serviceUrl;
	@Autowired
	protected RestTemplate restTemplate;
	
	
	public ProductRemoteService(String serviceUrl) {
		
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}


	public String getProduct()
	{
		String name = restTemplate.getForObject(serviceUrl+"/product", String.class);
		return name;
	}
}
