package com.sconfield.daisy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.sconfield.daisy.dao.CustomerDao;
import com.sconfield.daisy.model.CustLevel;
import com.sconfield.daisy.model.Customer;
import com.sconfield.daisy.model.MongoPage;

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

	public List<Customer> getByPage(Integer currentPage) {
		MongoPage mongoPage = new MongoPage();
		mongoPage.setCurrentPage(currentPage);
		
		Page<Customer> page = customerDao.findAll(mongoPage);
		List<Customer> list = new ArrayList<Customer>();
		for (Customer customer : page) {
			list.add(customer);
		}
		
		return list;
	}

}
