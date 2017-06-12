package com.tjl.gof.structural.facade;

public class Drawer2 implements IDrawer {

	@Override
	public void unlock(String key) {
		if (key.equals("key2")) {
			System.out.println("Drawer2 is unlocked successfully");
		} else {
			System.out.println("Not drawer2 key");
		}
	}

	@Override
	public void lock(String key) {
		if (key.equals("key2")) {
			System.out.println("Drawer2 is locked successfully");
		} else {
			System.out.println("Not drawer2 key");
		}
	}

	@Override
	public void putThings() {
		System.out.println("Drawer1 put things");
	}

	@Override
	public String getThings() {
		System.out.println("Get banana from drawer2");
		return "banana";
	}
}
