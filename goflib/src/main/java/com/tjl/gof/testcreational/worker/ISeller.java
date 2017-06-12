package com.tjl.gof.testcreational.worker;

/**
 * Created by tao on 2017/6/12.
 */

public interface ISeller {
    enum Capability{
        Big,Medium,Small
    }

    /**
     * 获得营业额
     * @return
     */
    int getTurnover();
}
