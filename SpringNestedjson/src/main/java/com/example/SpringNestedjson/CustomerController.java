package com.example.SpringNestedjson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/customer")
	public ResponseEntity<CustomerEntity> saveOrder(@RequestBody CustomerEntity customerentity)
	{
		CustomerEntity customer = customerservice.saveCustomer(customerentity);
		return ResponseEntity.ok(customer);
	}
}