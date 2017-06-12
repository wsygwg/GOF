package com.tjl.gof.structural.bridge;

public abstract class Bridge_People_CarRoad {
	public Bridge_Car_Road bridge_Car_Road;
	public Bridge_People_CarRoad(Bridge_Car_Road bridge_Car_Road) {
		this.bridge_Car_Road = bridge_Car_Road;
	}
	public abstract void who();
}
