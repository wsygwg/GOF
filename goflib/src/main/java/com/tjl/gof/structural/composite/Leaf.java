package com.tjl.gof.structural.composite;

public final class Leaf implements Component{

	String value;
	public Leaf(String value) {
		this.value = value;
	}
	
	@Override
	public void showValue() {
		System.out.println("leaf value " + value);
	}

	@Override
	public void add(Component component) {
	}

	@Override
	public void remove(Component component) {
	}

	@Override
	public Component getChild(int childNum) {
		return null;
	}

	@Override
	public void showTree() {
		showValue();
	}

	@Override
	public int getChildSize() {
		return 0;
	}

	@Override
	public String getComponentValue() {
		return value;
	}

}
