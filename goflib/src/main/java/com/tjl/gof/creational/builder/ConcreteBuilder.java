package com.tjl.gof.creational.builder;

import java.util.ArrayList;

public class ConcreteBuilder implements IBuilder{

	private ArrayList<Part> parts = new ArrayList<>();
	public void buildPartA(){
		Part part = new PartA();
		parts.add(part);
	}
	
	public void buildPartB(){
		Part part = new PartB();
		parts.add(part);
	}
	
	public void buildPartC(){
		Part part = new PartC();
		parts.add(part);
	}
	
	public void getResult(){
		for(Part part : parts){
			part.specification();
		}
	}
}
