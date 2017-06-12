package com.tjl.gof.structural.proxy;

public class Manager implements IWorker{
	
	private Employee employee;

	@Override
	public void work() {
		pre_work();
		if(employee == null){
			employee = new Employee();
			employee.work();
		}
		after_work();
	}
	
	private void pre_work(){
		System.out.println("manager do pre_work");
	}
	
	private void after_work(){
		System.out.println("manager do after_work");
	}

}
