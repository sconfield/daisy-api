package com.sconfield.daisy.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sconfield.daisy.model.RentOrderVO;
import com.sconfield.daisy.service.DashBoardServiceImpl;

@RestController
public class DashBoardController {
	
	@Autowired
	private DashBoardServiceImpl dashboardService;

	@GetMapping(value="/page/{page}")
	public List<RentOrderVO> queryPage(@PathVariable Integer page) {
		// FIXME: query page order.
		return dashboardService.getRentItemVOListByPage(page);
	}

}
