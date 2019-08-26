package com.tjl.gof.creational.abstract_factory;

import com.tjl.gof.PatternTest;

public class AbstractFactoryTest implements PatternTest {
    Factory factory1,factory2;//比如两个系列的手机：红米和小米note，用不同的cpu,camera等等
    @Override
    public void patternTestLogic() {
        factory1 = new ConcreteFactory1();
        factory2 = new ConcreteFactory2();
    }

    interface Factory {
        ProductA FactoryA();

        ProductB FactroyB();
    }

    class ConcreteFactory1 implements Factory {

        @Override
        public ProductA FactoryA() {
            return new ProductA1();
        }

        @Override
        public ProductB FactroyB() {
            return new ProductB1();
        }
    }

    class ConcreteFactory2 implements Factory {

        @Override
        public ProductA FactoryA() {
            return new ProductA2();
        }

        @Override
        public ProductB FactroyB() {
            return new ProductB2();
        }
    }

    interface ProductA {

    }

    interface ProductB {

    }

    class ProductA1 implements ProductA {

    }

    class ProductA2 implements ProductA {

    }

    class ProductB1 implements ProductB {

    }

    class ProductB2 implements ProductB {

    }
}
