package com.tjl.gof.structural.adapter;

public class HissClassAdapter2 extends HissClass{
	Oem oem;
	public void show(String type,String info) {
		if(oem == null){
			oem = new Oem();
		}
		if(type.equals(HissClass.typeHissClass)){
			super.show(info);
		}else if(type.equals(Oem.typeOem)){
			oem.showOemInfo(info);
		}else{
			System.out.println("Invalid type " + type + " with info " + info);
		}
	}
}
