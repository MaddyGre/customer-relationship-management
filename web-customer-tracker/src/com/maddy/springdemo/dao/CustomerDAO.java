package com.maddy.springdemo.dao;

import java.util.List;

import com.maddy.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
