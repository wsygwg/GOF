package com.tjl.gof.structural.decorator;

public abstract class IWearDecorator implements IWear{
	IWear iWear;
	public IWearDecorator(IWear iWear){
		this.iWear = iWear;
	}
	@Override
	public void wear() {
		showinfo("IWearDecorator");
		iWear.wear();
	}
	
	public abstract void showinfo(String str);
}
