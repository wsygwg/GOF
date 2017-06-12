package com.tjl.gof.structural.flyweight;

public class Circle implements IShape {

	private float radius,centerX,centerY;
	private String color;
	
	public Circle(){
		
	}
	
	public Circle(float radius, float centerX, float centerY, String color) {
		super();
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
		this.color = color;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getCenterX() {
		return centerX;
	}

	public void setCenterX(float centerX) {
		this.centerX = centerX;
	}

	public float getCenterY() {
		return centerY;
	}

	public void setCenterY(float centerY) {
		this.centerY = centerY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("draw cicle [color " + color + " ; x = " + centerX + " ; y = " + centerY + "]");
	}

}
