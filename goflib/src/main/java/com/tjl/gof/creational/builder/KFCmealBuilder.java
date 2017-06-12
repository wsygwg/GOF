package com.tjl.gof.creational.builder;

public class KFCmealBuilder extends AbstractMealBuilder {

	@Override
	public void makeFood(Food food) {
		meal.setFood(food);
		System.out.println("make food " + food.getFoodName());
	}

	@Override
	public void makeDrink(Drink drink) {
		meal.setDrink(drink);
		System.out.println("make drink " + drink.getDrink());
	}
	
	@Override
	public Meal getTheMeal() {
		System.out.println("we get you food " + meal.getFood().getFoodName() + " and drink " + meal.getDrink().getDrink());
		return super.getTheMeal();
	}
}
