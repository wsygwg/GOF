package com.tjl.gof.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {
	
	List<Component> list = new ArrayList<>();
	private String value;
	public Composite(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void showValue() {
		System.out.println("branch value " + value);
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		Iterator<Component> iterator = list.iterator();
		while(iterator.hasNext()){
			Component con = iterator.next();
			if(con.equals(component)){
				iterator.remove();
			}
		}
	}

	@Override
	public Component getChild(int childNum) {
		return list.get(childNum);
	}

	@Override
	public void showTree() {
		showValue();
		for(Component con : list){
			con.showTree();
		}
	}

	@Override
	public int getChildSize() {
		return list.size();
	}

	@Override
	public String getComponentValue() {
		return value;
	}
}
