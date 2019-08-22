package com.tjl.gof.creational.abstract_factory;

public class MeatFactory extends AbstractFoodFactory{
	public Meat getMeat(String meatType){
		if(meatType == null){
			return null;
		}else if(meatType.equals(MEAT_TYPE_BEEF)){
			return new Beef();
		}else if(meatType.equals(MEAT_TYPE_PORK)){
			return new Pork();
		}else{
			return null;
		}
	}

	@Override
	public Vegetable getVegetable(String vegetableType) {
		// TODO Auto-generated method stub
		return null;
	}
}
