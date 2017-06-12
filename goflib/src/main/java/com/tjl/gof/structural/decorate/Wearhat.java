package com.tjl.gof.structural.decorate;

public class Wearhat extends IWearDecorator {

	
	public Wearhat(IWear iWear) {
		super(iWear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showinfo(String str) {
		System.out.println(str);
	}
	
	@Override
	public void wear() {
		showinfo("Wearhat");
		super.wear();
	}

}
