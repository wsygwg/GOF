package com.tjl.gof.structural.decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		IWear wear = new WearShoes();
		IWear wear2 = new WearClothes(wear);
		IWear wear3 = new Wearhat(wear2);
//		wear.wear();
//		wear2.wear();
		wear3.wear();
	}
}
