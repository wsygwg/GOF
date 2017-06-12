package com.tjl.gof.creational.singleton;

public class Singleton {
	
	private static Singleton singleton;
	private static long createdTime;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
					createdTime = System.currentTimeMillis();
				}
			}
		}
		return singleton;
	}

	public static void showCreateTime(){
		System.out.println("Singleton create time = " + createdTime);
	}
}
