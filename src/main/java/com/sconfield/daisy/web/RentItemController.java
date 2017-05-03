package com.sconfield.daisy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sconfield.daisy.model.RentItem;
import com.sconfield.daisy.service.RentItemServiceImpl;

@RestController
public class RentItemController {

	@Autowired
	private RentItemServiceImpl rentItemService;

	@PostMapping(value="/item")
	public RentItem add(@RequestBody RentItem item) {
		return rentItemService.saveOrUpdate(item);
	}
	
	@DeleteMapping(value="/item/{id}")
	public void delete(@PathVariable String id) {
		rentItemService.deleteById(id);
	}
	
	@PutMapping(value="/item")
	public RentItem update(@RequestBody RentItem item) {
		return rentItemService.saveOrUpdate(item);
	}
	
	@GetMapping(value="/item/{id}")
	public RentItem queryOne(@PathVariable String id) {
		return rentItemService.getById(id);
	}
	
}
