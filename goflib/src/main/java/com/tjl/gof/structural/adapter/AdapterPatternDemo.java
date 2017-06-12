package com.tjl.gof.structural.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		HissClassAdapter1 adapter1 = new HissClassAdapter1();
		adapter1.show(HissClass.typeHissClass, "adapter1");
		adapter1.show(IOem.typeIOem, "adapter1");
		adapter1.show("fafdsafasdfasd","adapter1");
		HissClassAdapter2 adapter2 = new HissClassAdapter2();
		adapter2.show(HissClass.typeHissClass,"adapter2");
		adapter2.show(Oem.typeOem,"adapter2");
		adapter2.show("fafdsafasdfasd","adapter2");
	}
}
