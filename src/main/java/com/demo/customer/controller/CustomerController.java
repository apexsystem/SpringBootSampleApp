package com.demo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.dal.entities.Customer;
import com.demo.customer.service.CustomerService;

import ch.qos.logback.classic.Logger;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	

	
	@RequestMapping("/getAllCustomer")
	public static List<Customer> getAllLocation()
	{
		
		System.out.println("Logging... Cusomer ");
		Logger.debug("Logging Customer Data");
		//return customerService.getAllCustomer();
	}
	
	
}
