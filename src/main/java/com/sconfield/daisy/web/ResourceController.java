package com.sconfield.daisy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sconfield.daisy.model.Resource;
import com.sconfield.daisy.service.ResourceServiceImpl;

@RestController
public class ResourceController {

	@Autowired
	private ResourceServiceImpl resourceService;

	@PostMapping(value="/resource")
	public Resource add(@RequestBody Resource resource) {
		return resourceService.saveOrUpdate(resource);
	}
	
	@DeleteMapping(value="/resource/{id}")
	public void delete(@PathVariable String id) {
		resourceService.deleteById(id);
	}
	
	@PutMapping(value="/resource")
	public Resource update(@RequestBody Resource resource) {
		return resourceService.saveOrUpdate(resource);
	}
	
	@GetMapping(value="/resource/{id}")
	public Resource queryOne(@PathVariable String id) {
		return resourceService.getById(id);
	}
	
}
