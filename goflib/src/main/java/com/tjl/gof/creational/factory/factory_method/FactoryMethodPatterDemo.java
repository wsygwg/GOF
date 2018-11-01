package com.tjl.gof.creational.factory.factory_method;

public class FactoryMethodPatterDemo {

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
