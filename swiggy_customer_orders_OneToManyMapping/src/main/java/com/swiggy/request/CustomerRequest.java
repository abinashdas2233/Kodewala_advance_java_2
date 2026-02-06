package com.swiggy.request;

import java.util.List;

public class CustomerRequest {

    private String name;
    private double price;
    private List<FoodItemRequest> itemList;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<FoodItemRequest> getItemList() {
        return itemList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemList(List<FoodItemRequest> itemList) {
        this.itemList = itemList;
    }
}
