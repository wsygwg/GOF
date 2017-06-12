package com.tjl.gof.creational.builder;

public class Food {
	public String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public Food(String foodName) {
		this.foodName = foodName;
	}
}
