package com.tjl.gof.structural.flyweight;

public class FlyweightPatternDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		IShape shape = factory.createCircle("red", 100, 100, 100);
		shape.draw();
		
		shape = factory.createCircle("yello", 200, 200, 200);
		shape.draw();
		
		shape = factory.createCircle("blue", 300, 300, 300);
		shape.draw();
		
		shape = factory.createCircle("green", 400, 400, 400);
		shape.draw();
		
		shape = factory.createCircle("red", 500, 500, 500);
		shape.draw();
	}
}
