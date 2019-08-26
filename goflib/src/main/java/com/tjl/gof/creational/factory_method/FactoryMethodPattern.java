package com.tjl.gof.creational.factory_method;

import com.tjl.gof.PatternTest;

public class FactoryMethodPattern implements PatternTest {
    Factory factory1, factory2;
    Product product1, product2;

    @Override
    public void patternTestLogic() {
        factory1 = new Factory1();
        product1 = factory1.createProduct();
        factory2 = new Factory2();
        product2 = factory2.createProduct();
    }

    interface Product {
        void canBeUsed();
    }

    interface Factory {
        Product createProduct();
    }

    class Product1 implements Product {

        @Override
        public void canBeUsed() {

        }
    }

    class Product2 implements Product {

        @Override
        public void canBeUsed() {

        }
    }

    class Factory1 implements Factory {

        @Override
        public Product createProduct() {
            return new Product1();
        }
    }

    class Factory2 implements Factory {

        @Override
        public Product createProduct() {
            return new Product2();
        }
    }
}
