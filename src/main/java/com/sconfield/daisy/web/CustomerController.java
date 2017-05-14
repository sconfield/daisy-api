package com.sconfield.daisy.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sconfield.daisy.model.Customer;
import com.sconfield.daisy.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;

	@PostMapping(value="/customer")
	public Customer add(@RequestBody Customer customer) {
		return customerService.saveOrUpdate(customer);
	}
	
	@DeleteMapping(value="/customer/{id}")
	public void delete(@PathVariable String id) {
		customerService.deleteById(id);
	}
	
	@PutMapping(value="/customer")
	public Customer update(@RequestBody Customer customer) {
		return customerService.saveOrUpdate(customer);
	}
	
	@GetMapping(value="/customer/{id}")
	public Customer queryOne(@PathVariable String id) {
		return customerService.getById(id);
	}
	
	@GetMapping(value="/customer/page/{currentPage}")
	public List<Customer> queryPage(@PathVariable Integer currentPage) {
		return customerService.getByPage(currentPage);
	}
	
}
