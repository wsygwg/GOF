package com.tjl.gof.creational.builder;

public class KFCdirector {
	private IMealBuilder builder;
	public KFCdirector(IMealBuilder builder) {
		this.builder = builder;
	}
	public Meal getQM(){
		builder.makeFood(new Food("chicken"));
		builder.makeDrink(new Drink("beer"));
		Meal qm = builder.getTheMeal();
		return qm;
	}
	public Meal getBasicCourse(){
		builder.makeFood(new Food("hamburgur"));
		builder.makeDrink(new Drink("cola"));
		Meal qm = builder.getTheMeal();
		return qm;
	}
}
