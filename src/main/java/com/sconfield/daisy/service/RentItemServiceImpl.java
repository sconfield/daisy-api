package com.sconfield.daisy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sconfield.daisy.dao.RentItemDao;
import com.sconfield.daisy.model.Region;
import com.sconfield.daisy.model.RentItem;

@Service
public class RentItemServiceImpl implements BashService<RentItem> {
	
	@Autowired
	private RentItemDao rentItemDao;

	@Override
	public RentItem saveOrUpdate(RentItem item) {
		// TODO: default region.
		item.setRegion(Region.CHONGQING);
		return rentItemDao.save(item);
	}

	@Override
	public void deleteById(String id) {
		rentItemDao.delete(id);
	}

	@Override
	public RentItem getById(String id) {
		return rentItemDao.findOne(id);
	}

	public List<RentItem> getByOrderId(String id) {
		return rentItemDao.findByOrderId(id);
	}

}
