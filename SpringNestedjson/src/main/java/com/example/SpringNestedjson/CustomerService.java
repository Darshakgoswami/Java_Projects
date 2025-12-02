package com.example.SpringNestedjson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerrepository;
	public CustomerEntity saveCustomer(CustomerEntity entity)
	{
		entity.getOrderentity().forEach(order->order.setCustomerentity(entity));
		return customerrepository.save(entity);
	}
}