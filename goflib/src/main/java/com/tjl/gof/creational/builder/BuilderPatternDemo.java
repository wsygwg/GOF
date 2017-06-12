package com.tjl.gof.creational.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		KFCdirector director = new KFCdirector(new KFCmealBuilder());
		director.getBasicCourse();
		director.getQM();
	}
}
