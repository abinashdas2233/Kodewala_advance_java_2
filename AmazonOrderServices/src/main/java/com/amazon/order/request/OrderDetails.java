package com.amazon.order.request;

public class OrderDetails {
	 private String itemName;
	 private double price;
	 private int quantity;
	 private String description;
	 @Override
	 public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	 }
	 public String getItemName() {
		 return itemName;
	 }
	 public void setItemName(String itemName) {
		 this.itemName = itemName;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 public int getQuantity() {
		 return quantity;
	 }
	 public void setQuantity(int quantity) {
		 this.quantity = quantity;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public OrderDetails(String itemName, double price, int quantity, String description) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	 }
	 public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 
}
