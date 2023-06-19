package com.shankar.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shankar.model.Customer;

@RestController
@RequestMapping("/customerapi")
public class JSonProvidercontroller {
	@GetMapping("/register")
	public ResponseEntity<Customer> getcustomerinfo(){
		Customer cust=new Customer(1012, "Shankar Reddy","Pedda Anberpet",1010.00f);
		System.out.println("Customer.java");
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}

}
