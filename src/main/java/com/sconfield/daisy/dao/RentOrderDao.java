package com.sconfield.daisy.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sconfield.daisy.model.RentOrder;

@Repository
public interface RentOrderDao extends MongoRepository<RentOrder, String> {

}
