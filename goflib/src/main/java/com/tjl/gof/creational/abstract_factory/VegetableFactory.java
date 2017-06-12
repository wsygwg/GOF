package com.tjl.gof.creational.abstract_factory;

public class VegetableFactory extends AbstractFoodFactory{
	public Vegetable getVegetable(String vegetableType){
		if(vegetableType == null){
			return null;
		}else if(vegetableType.equals(VEGETALBE_TYPE_TOMATO)){
			return new Tomato();
		}else if(vegetableType.equals(VEGETALBE_TYPE_EGGPLANT)){
			return new Eggplant();
		}else{
			return null;
		}
	}

	@Override
	public Meat getMeat(String meatType) {
		// TODO Auto-generated method stub
		return null;
	}
}
