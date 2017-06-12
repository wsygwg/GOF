package com.tjl.gof.creational.prototype;

public abstract class ProtoFood implements Cloneable{
	StringBuilder foodName;
	StringBuilder foodPrice;
	public StringBuilder getFoodName() {
		return foodName;
	}
	public void setFoodName(StringBuilder foodName) {
		this.foodName = foodName;
	}
	public StringBuilder getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(StringBuilder foodPrice) {
		this.foodPrice = foodPrice;
	}
	public abstract void showFoodInfo();
	@Override
	protected Object clone(){
		System.out.println("ProtoFood clone");
		Object clone = null;
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}
}
