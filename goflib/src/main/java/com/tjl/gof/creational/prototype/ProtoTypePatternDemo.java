package com.tjl.gof.creational.prototype;

public class ProtoTypePatternDemo {
	public static void main(String[] args) {
		ProtoFood pf = new KFC();
		pf.setFoodName(new StringBuilder("chicken"));
		pf.setFoodPrice(new StringBuilder("100"));
		System.out.println("pf = " + pf + " ; hash0 = " + pf.hashCode() + " ; hash1 = " + pf.getFoodName().hashCode() + " ; hash2 = " + pf.getFoodPrice().hashCode());
		pf.showFoodInfo();
		System.out.println("*****************************************");
		try {
			ProtoFood pfCopy = (ProtoFood) pf.clone();
			System.out.println("pfCopy = " + pfCopy + " ; hash0 = " + pfCopy.hashCode() + " ; hash1 = " + pfCopy.getFoodName().hashCode() + " ; hash2 = " + pfCopy.getFoodPrice().hashCode());
			pfCopy.showFoodInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
