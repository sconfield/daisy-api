package com.sconfield.daisy.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sconfield.daisy.model.RentItem;

@Repository
public interface RentItemDao extends MongoRepository<RentItem, String> {

	List<RentItem> findByOrderId(String id);

}
