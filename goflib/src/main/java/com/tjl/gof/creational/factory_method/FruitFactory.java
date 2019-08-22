package com.tjl.gof.creational.factory_method;

public class FruitFactory implements IFruitFactory{
	public Fruit getFruitByStr(String str){
		if(str == null){
			return null;
		}else if(str.equals(FRUIT_TYPE_APPLE)){
			return new Apple();
		}else if(str.equals(FRUIT_TYPE_PEACH)){
			return new Peach();
		}else{
			return null;
		}
	}
}
