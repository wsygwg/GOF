package com.tjl.gof.creational.singleton;

public class Client {
	public static void main(String[] args) {
		Singleton.showCreateTime();
		Singleton singleton;
		singleton = Singleton.getInstance();
		Singleton.showCreateTime();
		singleton = Singleton.getInstance();
		Singleton.showCreateTime();
	}
}
