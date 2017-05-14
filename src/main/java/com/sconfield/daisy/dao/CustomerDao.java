package com.sconfield.daisy.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sconfield.daisy.model.Customer;

@Repository
public interface CustomerDao extends MongoRepository<Customer, String> {
	
}
