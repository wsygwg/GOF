package com.tjl.gof.creational.builder;

import java.util.ArrayList;

public class Director {
	
	private IBuilder builder;
	
	public Director(IBuilder builder){
		this.builder = builder;

	}
	
	public void constructProduct(){
		builder.buildPartA();
		builder.buildPartC();
		builder.buildPartB();
	}
	
}
