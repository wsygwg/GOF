package com.tjl.gof.testcreational.factory;

/**
 * Created by tao on 2017/6/12.
 */

public abstract class HissAbstractFactory {
    enum FactoryType{
        Hardware,Software
    }
    public abstract  getFactory(FactoryType factoryType);
}
