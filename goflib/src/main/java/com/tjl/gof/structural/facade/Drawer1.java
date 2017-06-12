package com.tjl.gof.structural.facade;

public class Drawer1 implements IDrawer {

	@Override
	public void unlock(String key) {
		if (key.equals("key1")) {
			System.out.println("Drawer1 is unlocked successfully");
		} else {
			System.out.println("Not drawer1 key");
		}
	}

	@Override
	public void lock(String key) {
		if (key.equals("key1")) {
			System.out.println("Drawer1 is locked successfully");
		} else {
			System.out.println("Not drawer1 key");
		}
	}

	@Override
	public void putThings() {
		System.out.println("Drawer1 put things");
	}

	@Override
	public String getThings() {
		System.out.println("Get key2 from drawer1");
		return "key2";
	}
}
