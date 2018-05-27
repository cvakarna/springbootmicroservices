package com.cva.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

	 @Autowired
	  private Environment environment;
	
	@RequestMapping(value = "/name",method=RequestMethod.GET)
	public String getUser()
	{
		return "siva karna "+environment.getProperty("local.server.port");
	}
}
