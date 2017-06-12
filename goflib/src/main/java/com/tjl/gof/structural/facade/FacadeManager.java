package com.tjl.gof.structural.facade;

public class FacadeManager {
	private IDrawer drawer1;
	private IDrawer drawer2;
	
	public FacadeManager() {
		drawer1 = new Drawer1();
		drawer2 = new Drawer2();
	}
	
	public void unlockDrawer1(String key){
		drawer1.unlock(key);
	}
	
	public void lockDrawer1(String key){
		drawer1.lock(key);
	}
	
	public void unlockDrawer2(String key){
		drawer2.unlock(key);
	}
	
	public void lockDrawer2(String key){
		drawer2.lock(key);
	}
	
	public String getDrawer1Things(){
		return drawer1.getThings();
	}
	
	public String getDrawer2Things(){
		return drawer2.getThings();
	}
	
	public void putDrawer1Things(){
		drawer1.putThings();
	}
	
	public void putDrawer2Things(){
		drawer2.putThings();
	}
}
