package com.tjl.gof.testcreational.factory;

import com.tjl.gof.testcreational.product.SafeFunction;
import com.tjl.gof.testcreational.product.SafeSize;
import com.tjl.gof.testcreational.product.SmartSafe;

/**
 * Created by tao on 2017/6/12.
 */

public interface ISafeFactory {
    SmartSafe createSafe(SafeFunction sf, SafeSize ss);
}
