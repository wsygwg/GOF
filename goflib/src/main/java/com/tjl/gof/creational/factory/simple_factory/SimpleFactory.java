package com.tjl.gof.creational.factory.simple_factory;

public class SimpleFactory {
    public static Fruit createFruit(String flavor){
        if(flavor.equals("sweet")){
            return new Apple();
        }else if(flavor.equals("sour")){
            return new Kiwi();
        }else{
            return null;
        }
    }
}
