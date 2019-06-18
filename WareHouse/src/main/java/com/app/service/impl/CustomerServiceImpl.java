package com.app.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerDao dao;
	@Transactional
	public Integer saveCustomer(Customer c) {
		// TODO Auto-generated method stub
		return dao.saveCustomer(c);
	}

	@Transactional
	public void updateCustomer(Customer c) {

		dao.updateCustomer(c);
	}

	@Transactional
	public void deleteCustomer(Integer id) {

		dao.deleteCustomer(id);
	}

	@Transactional(readOnly=true)
	public Customer getOneCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneCustomerById(id);
	}

	@Transactional(readOnly=true)
	public List<Customer> getAllCustomers() {

		List<Customer> c=dao.getAllCustomers();
		Collections.sort(c,(o1,o2)->o1.getCustId()-o2.getCustId());
		return c;
	}

}
