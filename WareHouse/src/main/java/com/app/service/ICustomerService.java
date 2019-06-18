package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {


	public Integer saveCustomer(Customer c);
	public void updateCustomer(Customer c);
	public void deleteCustomer(Integer id);
	public Customer getOneCustomerById(Integer id);
	public List<Customer> getAllCustomers();
}
