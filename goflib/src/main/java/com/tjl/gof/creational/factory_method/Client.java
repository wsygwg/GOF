package com.tjl.gof.creational.factory_method;

public class Client {

	public static void main(String[] args) {
		IFruitFactory ff = new FruitFactory();
		Fruit apple = ff.getFruitByStr(IFruitFactory.FRUIT_TYPE_APPLE);
		apple.weight();
		apple.price();
		Fruit peach = ff.getFruitByStr(IFruitFactory.FRUIT_TYPE_PEACH);
		peach.weight();
		peach.price();
	}
}
