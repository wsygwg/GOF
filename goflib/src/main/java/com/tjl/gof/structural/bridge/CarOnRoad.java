package com.tjl.gof.structural.bridge;

public class CarOnRoad extends Bridge_Car_Road{

	public CarOnRoad(Road road) {
		super(road);
	}

	@Override
	public void run() {
		System.out.print("小汽车行驶在");
		road.location();
	}

}
