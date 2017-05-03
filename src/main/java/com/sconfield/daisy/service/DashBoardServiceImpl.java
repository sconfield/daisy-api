package com.sconfield.daisy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sconfield.daisy.dao.CustomerDao;
import com.sconfield.daisy.dao.RentOrderDao;
import com.sconfield.daisy.model.Customer;
import com.sconfield.daisy.model.RentOrder;
import com.sconfield.daisy.model.RentOrderVO;

@Service
public class DashBoardServiceImpl {
	
	@Autowired
	private RentOrderDao rentOrderDao;
	
	@Autowired
	private CustomerDao customerDao;

	public List<RentOrderVO> getRentItemVOListByPage(Integer page) {
		List<RentOrderVO> voList = new ArrayList<RentOrderVO>();
		List<RentOrder> orderList = rentOrderDao.findAll();
		
		for (RentOrder order : orderList) {
			RentOrderVO vo = new RentOrderVO();
			Customer customer = customerDao.findOne(order.getCustomerId());
			vo.setRentOrder(order);
			vo.setCustomer(customer);
			voList.add(vo);
		}
		
		return voList;
	}

}
