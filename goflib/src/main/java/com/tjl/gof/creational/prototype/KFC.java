package com.tjl.gof.creational.prototype;

public class KFC extends ProtoFood {
	@Override
	protected Object clone(){
		System.out.println("kfc clone");
		return super.clone();
	}

	@Override
	public void showFoodInfo() {
		System.out.println("kfc food name = " + foodName + " ; food price = " + foodPrice);
	}
}
