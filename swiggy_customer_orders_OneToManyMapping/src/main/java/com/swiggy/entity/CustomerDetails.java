package com.swiggy.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	@OneToMany(cascade = CascadeType.ALL)
	private List<FoodItemsDetails>itemList;
	public CustomerDetails(int id, String name, double price, List<FoodItemsDetails> itemList) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.itemList = itemList;
	}
	public CustomerDetails() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<FoodItemsDetails> getItemList() {
		return itemList;
	}
	public void setItemList(List<FoodItemsDetails> itemList) {
		this.itemList = itemList;
	}
	
	
	
	
	
	

}
