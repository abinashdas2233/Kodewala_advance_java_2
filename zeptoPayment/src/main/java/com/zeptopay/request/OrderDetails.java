package com.zeptopay.request;

public class OrderDetails {
	private double amount;
	private String description;
	private String bankName;
	private String paymentType;
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public OrderDetails(double amount, String description, String bankName, String paymentType) {
		super();
		this.amount = amount;
		this.description = description;
		this.bankName = bankName;
		this.paymentType = paymentType;
	}

}
