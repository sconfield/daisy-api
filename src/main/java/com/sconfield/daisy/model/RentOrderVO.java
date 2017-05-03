package com.sconfield.daisy.model;

public class RentOrderVO {
	
	private RentOrder rentOrder;
	private Customer customer;
	
	// getter and setter.
	public RentOrder getRentOrder() {
		return rentOrder;
	}
	public void setRentOrder(RentOrder rentOrder) {
		this.rentOrder = rentOrder;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}