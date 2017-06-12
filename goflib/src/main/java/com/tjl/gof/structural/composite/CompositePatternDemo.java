package com.tjl.gof.structural.composite;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Component component = new Composite("1");
		for(int i = 2 ; i < 10 ; i++){
			component.add(new Composite(i + ""));
		}
		int num = component.getChildSize();
		for(int j = 0 ; j < num ; j++){
			if(j%2 == 0){
				component.add(new Leaf("10" + component.getChild(j).getComponentValue()));
			}else{
				component.add(new Composite("20" + component.getChild(j).getComponentValue()));
			}
		}
		component.showTree();
	}
}
