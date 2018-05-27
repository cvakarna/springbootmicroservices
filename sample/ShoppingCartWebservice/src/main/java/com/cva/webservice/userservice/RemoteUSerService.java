package com.cva.webservice.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


public class RemoteUSerService {

	
	protected String serviceUrl;
	@Autowired
	protected RestTemplate restTemplate;
	
	
	public RemoteUSerService(String serviceUrl) {
		
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}


	public String getUser()
	{
		String name = restTemplate.getForObject(serviceUrl+"/name", String.class);
		return name;
	}
}
