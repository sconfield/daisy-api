package com.sconfield.daisy.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sconfield.daisy.dao.RentOrderDao;
import com.sconfield.daisy.model.RentOrder;

@Service
public class RentOrderServiceImpl implements BashService<RentOrder> {
	
	@Autowired
	private RentOrderDao rentOrderDao;

	@Override
	public RentOrder saveOrUpdate(RentOrder order) {
		if (StringUtils.isEmpty(order.getId())) {
			order.setCreateDate(new Date());
		}
		return rentOrderDao.save(order);
	}

	@Override
	public void deleteById(String id) {
		rentOrderDao.delete(id);
	}

	@Override
	public RentOrder getById(String id) {
		return rentOrderDao.findOne(id);
	}

}
