package com.amazon.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class AmazonOrderData {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer orderId;

	    private String itemName;
	    private double price;
	    private int quantity;
	    private String description;

	    public AmazonOrderData() {
	    }

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
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

	    
	}

	 

