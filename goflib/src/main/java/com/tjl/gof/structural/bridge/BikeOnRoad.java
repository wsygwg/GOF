package com.tjl.gof.structural.bridge;

public class BikeOnRoad extends Bridge_Car_Road{

	public BikeOnRoad(Road road) {
		super(road);
	}

	@Override
	public void run() {
		System.out.print("自行车行驶在");
		road.location();
	}

}
