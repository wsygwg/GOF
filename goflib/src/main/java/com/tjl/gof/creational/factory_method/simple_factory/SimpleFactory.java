package com.tjl.gof.creational.factory_method.simple_factory;

public class SimpleFactory{
    /**
     * 由于简单工厂模式使用静态方法作为工厂方法，而静态方法无法由子类继承，
     * 因此，工厂角色无法形成基于继承的等级结构。
     * 这一缺点会在工厂方法模式中得到克服。
     * @param flavor
     * @return
     */
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
