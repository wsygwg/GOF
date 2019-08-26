package com.tjl.gof.creational.singleton;

public class Singleton {
    private static Singleton instance;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 获取实例 */
    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
