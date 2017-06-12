package com.tjl.gof.structural.facade;

public interface IDrawer {
	void unlock(String key);
	void lock(String key);
	String getThings();
	void putThings();
}
