package com.tjl.gof.structural.proxy;

public class Employee implements IWorker {

	@Override
	public void work() {
		System.out.println("Employee do basic work");
	}

}
