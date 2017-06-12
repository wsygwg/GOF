package com.tjl.gof.testcreational.worker;

/**
 * Created by tao on 2017/6/12.
 */

public class CEO implements IHissWorker {
    private static final String TAG = CEO.class.getSimpleName();
    @Override
    public void describeJob() {
        System.out.println("I'm ceo of hiss");
    }
    private static CEO ceo;
    public static CEO getInstance(){
        if(ceo == null){
            synchronized (CEO.class){
                if(ceo == null){
                    ceo = new CEO();
                }
            }
        }
        return ceo;
    }

    private CEO(){

    }
}
