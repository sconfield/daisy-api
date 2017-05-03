package com.sconfield.daisy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sconfield.daisy.dao.CustomerDao;
import com.sconfield.daisy.model.CustLevel;
import com.sconfield.daisy.model.Customer;

@Service
public class CustomerServiceImpl implements BashService<Customer> {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer saveOrUpdate(Customer customer) {
		// TODO: set cust level.
		customer.setLevel(CustLevel.HUMAN);
		return customerDao.save(customer);
	}

	@Override
	public void deleteById(String id) {
		customerDao.delete(id);
	}

	@Override
	public Customer getById(String id) {
		return customerDao.findOne(id);
	}

}
