package com.sconfield.daisy.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sconfield.daisy.model.Resource;

@Repository
public interface ResourceDao extends MongoRepository<Resource, String> {

}
