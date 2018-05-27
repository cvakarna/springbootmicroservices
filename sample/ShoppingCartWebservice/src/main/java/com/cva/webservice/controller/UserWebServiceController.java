package com.cva.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cva.webservice.userservice.ProductRemoteService;
import com.cva.webservice.userservice.RemoteUSerService;

@RestController
public class UserWebServiceController {

	@Autowired
	RemoteUSerService userService;
	
/*	@Autowired
	ProductRemoteService productService;*/
	
	
	public UserWebServiceController(RemoteUSerService userService){
		this.userService =userService;
	}
	
	@RequestMapping(value = "/name",method=RequestMethod.GET)
	public String getName()
	{
		String result = userService.getUser();
		return result;
	}

	
}
