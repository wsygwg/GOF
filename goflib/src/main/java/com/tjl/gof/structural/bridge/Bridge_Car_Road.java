package com.tjl.gof.structural.bridge;

public abstract class Bridge_Car_Road{
	
	public Road road;
	
	public Bridge_Car_Road(Road road) {
		this.road = road;
	}
	
	public abstract void run();
}
