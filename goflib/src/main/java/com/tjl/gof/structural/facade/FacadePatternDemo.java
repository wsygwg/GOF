package com.tjl.gof.structural.facade;

public class FacadePatternDemo {
	/**
	 * 从第一个抽屉里取得钥匙来打开第二个抽屉，取得里面的香蕉
	 * @param args
	 */
	public static void main(String[] args) {
		FacadeManager fm = new FacadeManager();
		fm.unlockDrawer1("key1");
		String key = fm.getDrawer1Things();
		fm.unlockDrawer2(key);
		fm.getDrawer2Things();
	}
}
