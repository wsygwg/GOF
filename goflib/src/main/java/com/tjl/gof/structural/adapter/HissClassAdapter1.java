package com.tjl.gof.structural.adapter;

public class HissClassAdapter1 extends HissClass implements IOem{
	public void show(String type,String info) {
		if(type.equals(HissClass.typeHissClass)){
			super.show(info);
		}else if(type.equals(IOem.typeIOem)){
			showOemInfo(info);
		}else{
			System.out.println("Invalid type " + type + " with info " + info);
		}
	}
	@Override
	public void showOemInfo(String a) {
		System.out.println("IOem show " + a);
		
	}
}
