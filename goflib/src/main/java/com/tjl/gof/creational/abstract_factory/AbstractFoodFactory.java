package com.tjl.gof.creational.abstract_factory;

public abstract class AbstractFoodFactory {
	public static final String FACTORY_TYPE_MEAT = "FACTORY_TYPE_MEAT";
	public static final String FACTORY_TYPE_VEGETALBE = "FACTORY_TYPE_VEGETALBE";
	public static final String MEAT_TYPE_BEEF = "MEAT_TYPE_BEEF";
	public static final String MEAT_TYPE_PORK = "MEAT_TYPE_PORK";
	public static final String VEGETALBE_TYPE_TOMATO = "VEGETALBE_TYPE_TOMATO";
	public static final String VEGETALBE_TYPE_EGGPLANT = "VEGETALBE_TYPE_EGGPLANT";
	public abstract Meat getMeat(String meatType);
	public abstract Vegetable getVegetable(String vegetableType);
	public static AbstractFoodFactory getFactory(String factoryType){
		if(factoryType == null){
			return null;
		}else if(factoryType.equals(FACTORY_TYPE_MEAT)){
			return new MeatFactory();
		}else if(factoryType.equals(FACTORY_TYPE_VEGETALBE)){
			return new VegetableFactory();
		}else{
			return null;
		}
	}
}
