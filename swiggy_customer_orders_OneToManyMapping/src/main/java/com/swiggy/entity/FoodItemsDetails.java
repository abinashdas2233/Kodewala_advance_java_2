package com.swiggy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class FoodItemsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String itemName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public FoodItemsDetails(int id, String itemName) {
		super();
		this.id = id;
		this.itemName = itemName;
	}
	public FoodItemsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
