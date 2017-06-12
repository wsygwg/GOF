package com.tjl.gof.testcreational.factory;

import com.tjl.gof.testcreational.product.HissCosmetic;
import com.tjl.gof.testcreational.product.HissProduct;
import com.tjl.gof.testcreational.product.SafeFunction;
import com.tjl.gof.testcreational.product.SafeSize;
import com.tjl.gof.testcreational.product.SmartSafe;

/**
 * Created by tao on 2017/6/12.
 */

public class HardwareFactory implements IHissFactory,ISafeFactory,IcosmeticFactory {

    @Override
    public SmartSafe createSafe(SafeFunction sf, SafeSize ss) {
        return null;
    }

    @Override
    public HissCosmetic createCosmetic() {
        return null;
    }

    @Override
    public HissProduct createProduct() {
        return null;
    }
}
