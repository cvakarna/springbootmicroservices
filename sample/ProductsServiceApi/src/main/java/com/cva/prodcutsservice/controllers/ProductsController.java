package com.cva.prodcutsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@Autowired
	private Environment environment;

	@RequestMapping(value = "/product",method = RequestMethod.GET)
	public String productName() {
		return "Product:Mobile\tPort:" + environment.getProperty("local.server.port");
	}

}
