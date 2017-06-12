package com.tjl.gof.creational.abstract_factory;

import com.tjl.gof.creational.factory_method.Fruit;

public class Tomato implements Vegetable {

	@Override
	public void vegetableType() {
		System.out.println("I'm tomato with color of red or yellow");
		
	}

}
