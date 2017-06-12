package com.tjl.gof.structural.bridge;

public class ManCarRoad extends Bridge_People_CarRoad{

	public ManCarRoad(Bridge_Car_Road bridge_Car_Road) {
		super(bridge_Car_Road);
	}

	@Override
	public void who() {
		System.out.print("男人使用");
		bridge_Car_Road.run();
	}

}
