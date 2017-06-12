package com.tjl.gof.structural.composite;

public interface Component {
	void showValue();
	void showTree();
	void add(Component component);
	void remove(Component component);
	Component getChild(int childNum);
	int getChildSize();
	String getComponentValue();
}
