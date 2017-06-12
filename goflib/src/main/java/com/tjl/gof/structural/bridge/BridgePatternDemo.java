package com.tjl.gof.structural.bridge;

/**
 * 通过桥接模式，有效减小类的个数的定义
 * @author junliang
 *
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Bridge_Car_Road cr = new CarOnRoad(new Highway());
		cr.run();
		Bridge_Car_Road cr2 = new CarOnRoad(new SmallWay());
		cr2.run();
		Bridge_Car_Road cr3 = new BikeOnRoad(new Highway());
		cr3.run();
		Bridge_Car_Road cr4 = new BikeOnRoad(new SmallWay());
		cr4.run();
		System.out.println("");
		Bridge_People_CarRoad pcr = new ManCarRoad(cr);
		pcr.who();
		Bridge_People_CarRoad pcr2 = new ManCarRoad(cr2);
		pcr2.who();
		Bridge_People_CarRoad pcr3 = new ManCarRoad(cr3);
		pcr3.who();
		Bridge_People_CarRoad pcr4 = new ManCarRoad(cr4);
		pcr4.who();
		Bridge_People_CarRoad pcr5 = new WomanCarRoad(cr);
		pcr5.who();
		Bridge_People_CarRoad pcr6 = new WomanCarRoad(cr2);
		pcr6.who();
		Bridge_People_CarRoad pcr7 = new WomanCarRoad(cr3);
		pcr7.who();
		Bridge_People_CarRoad pcr8 = new WomanCarRoad(cr4);
		pcr8.who();
	}
}
