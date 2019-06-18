package com.app.dao;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerDao {

	public Integer saveCustomer(Customer or);
	public void updateCustomer(Customer or);
	public void deleteCustomer(Integer id);
	public Customer getOneCustomerById(Integer id);
	public List<Customer> getAllCustomers();
}
