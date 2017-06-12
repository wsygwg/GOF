package com.tjl.gof.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private HashMap<String, IShape> shapeMap;
	
	public ShapeFactory(){
		if(shapeMap == null){
			shapeMap = new HashMap<>();
		}
	}
	
	public Circle createCircle(String color, float radius, float x, float y){
		Circle circle = (Circle) shapeMap.get(color);
		if(circle == null){
			System.out.println("create new circle");
			circle = new Circle(radius,x,y,color);
			shapeMap.put(color, circle);
		}else{
			System.out.println("use old circle and change circle properties");
			circle.setRadius(radius);
			circle.setCenterX(x);
			circle.setCenterY(y);
		}
		return circle;
	}
}
