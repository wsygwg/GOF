package com.tjl.gof.structural.bridge;

public class WomanCarRoad extends Bridge_People_CarRoad{

	public WomanCarRoad(Bridge_Car_Road bridge_Car_Road) {
		super(bridge_Car_Road);
	}

	@Override
	public void who() {
		System.out.print("女人使用");
		bridge_Car_Road.run();
	}

}
