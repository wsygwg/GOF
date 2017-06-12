package com.tjl.gof.structural.decorate;

public class WearClothes extends IWearDecorator {

	public WearClothes(IWear iWear) {
		super(iWear);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wear() {
		showinfo("WearClothes~~~~~~~~~");
		super.wear();
	}

	@Override
	public void showinfo(String str) {
		System.out.println(str);
	}
}
