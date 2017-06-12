package com.tjl.gof.structural.proxy;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		IWorker worker = new Manager();
		worker.work();
	}
}
