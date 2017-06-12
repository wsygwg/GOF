package com.tjl.gof.creational.builder;

public abstract class AbstractMealBuilder implements IMealBuilder {
	
	protected Meal meal = new Meal();

	@Override
	public abstract void makeFood(Food food);

	@Override
	public abstract void makeDrink(Drink drink);
	
	@Override
	public Meal getTheMeal() {
		return meal;
	}

}
