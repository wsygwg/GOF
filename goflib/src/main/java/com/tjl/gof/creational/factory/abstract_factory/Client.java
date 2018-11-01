package com.tjl.gof.creational.factory.abstract_factory;

public class Client {
	public static void main(String[] args) {
		AbstractFoodFactory factory;
		factory = AbstractFoodFactory.getFactory(AbstractFoodFactory.FACTORY_TYPE_MEAT);
		Meat beef = factory.getMeat(AbstractFoodFactory.MEAT_TYPE_BEEF);
		beef.meatType();
		Meat pork = factory.getMeat(AbstractFoodFactory.MEAT_TYPE_PORK);
		pork.meatType();
		factory = AbstractFoodFactory.getFactory(AbstractFoodFactory.FACTORY_TYPE_VEGETALBE);
		Vegetable tomato = factory.getVegetable(AbstractFoodFactory.VEGETALBE_TYPE_TOMATO);
		tomato.vegetableType();
		Vegetable eggplant = factory.getVegetable(AbstractFoodFactory.VEGETALBE_TYPE_EGGPLANT);
		eggplant.vegetableType();
	}
}
