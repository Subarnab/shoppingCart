package com.niit.perfume.service;

import java.util.List;

import com.niit.perfume.model.Customer;



public interface CustomerService {
	 void addCustomer(Customer customer);

	    Customer getCustomerById(int customerId);

	    List<Customer> getAllCustomers();

	    Customer getCustomerByUsername(String username);
}
