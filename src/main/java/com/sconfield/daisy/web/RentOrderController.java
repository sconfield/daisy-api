package com.sconfield.daisy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sconfield.daisy.model.RentOrder;
import com.sconfield.daisy.service.RentOrderServiceImpl;

@RestController
public class RentOrderController {
	
	@Autowired
	private RentOrderServiceImpl rentOrderService;

	@PostMapping(value="/order")
	public RentOrder add(@RequestBody RentOrder order) {
		return rentOrderService.saveOrUpdate(order);
	}

	@DeleteMapping(value="/order/{id}")
	public void delete(@PathVariable String id) {
		rentOrderService.deleteById(id);
	}

	@PutMapping(value="/order")
	public RentOrder update(@RequestBody RentOrder order) {
		return rentOrderService.saveOrUpdate(order);
	}

	@GetMapping(value="/order/{id}")
	public RentOrder queryOne(@PathVariable String id) {
		return rentOrderService.getById(id);
	}

}
