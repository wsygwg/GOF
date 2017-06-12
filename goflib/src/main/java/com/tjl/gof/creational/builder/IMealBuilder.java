package com.tjl.gof.creational.builder;

public interface IMealBuilder {
	void makeFood(Food food);
	void makeDrink(Drink drink);
	Meal getTheMeal();
}
