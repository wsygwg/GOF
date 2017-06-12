package com.tjl.gof.creational.singleton;

public class Client {
	public static void main(String[] args) {
		Singleton singleton;
		singleton = Singleton.getInstance();
		Singleton.showCreateTime();
		singleton = Singleton.getInstance();
		Singleton.showCreateTime();
//		for(int i = 0 ; i < 100 ; i++){
//			Singleton.getInstance();
//			Singleton.showCreateTime();
//		}
	}
}
