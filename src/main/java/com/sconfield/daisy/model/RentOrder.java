package com.sconfield.daisy.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RentOrder {
	
	@Id
	private String id;
	
	// date, calculate rent days.
	private Date createDate;
	private Date rentDate;
	private Date returnDate;
	
	// price.
	private Float orderPrice;
	private Float rentPrice;
	private Float cashPledge;
	private Float favourPrice;

	// base.
	private String customerId;
	private Boolean isInvoiced;
	private Boolean isOver;
	private String remark;
	
	// getter and setter.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Float getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(Float rentPrice) {
		this.rentPrice = rentPrice;
	}
	public Float getCashPledge() {
		return cashPledge;
	}
	public void setCashPledge(Float cashPledge) {
		this.cashPledge = cashPledge;
	}
	public Float getFavourPrice() {
		return favourPrice;
	}
	public void setFavourPrice(Float favourPrice) {
		this.favourPrice = favourPrice;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Boolean getIsInvoiced() {
		return isInvoiced;
	}
	public void setIsInvoiced(Boolean isInvoiced) {
		this.isInvoiced = isInvoiced;
	}
	public Boolean getIsOver() {
		return isOver;
	}
	public void setIsOver(Boolean isOver) {
		this.isOver = isOver;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}