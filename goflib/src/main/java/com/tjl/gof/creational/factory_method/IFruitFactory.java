package com.tjl.gof.creational.factory_method;

public interface IFruitFactory {
	public static final String FRUIT_TYPE_APPLE = "apple";
	public static final String FRUIT_TYPE_PEACH = "peach";
	Fruit getFruitByStr(String str);
}
