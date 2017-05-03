package com.sconfield.daisy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sconfield.daisy.dao.ResourceDao;
import com.sconfield.daisy.model.Category;
import com.sconfield.daisy.model.Resource;

@Service
public class ResourceServiceImpl implements BashService<Resource> {
	
	@Autowired
	private ResourceDao resourceDao;

	@Override
	public Resource saveOrUpdate(Resource resource) {
		// TODO: set default clothes type.
		resource.setCategory(Category.SKRIT);
		return resourceDao.save(resource);
	}

	@Override
	public void deleteById(String id) {
		resourceDao.delete(id);
	}

	@Override
	public Resource getById(String id) {
		return resourceDao.findOne(id);
	}

}
