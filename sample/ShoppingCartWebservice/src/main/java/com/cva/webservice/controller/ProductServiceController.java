package com.cva.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cva.webservice.userservice.ProductRemoteService;
import com.cva.webservice.userservice.RemoteUSerService;

public class ProductServiceController {

	@Autowired
	ProductRemoteService productService;
	
	public ProductServiceController(ProductRemoteService productService){
		this.productService =productService;
	}
	@RequestMapping(value = "/product",method=RequestMethod.GET)
	public String getProduct()
	{
		String result = productService.getProduct();
		return result;
	}
}
