package com.tjl.gof.creational.builder;

import com.tjl.gof.PatternTest;
import com.tjl.gof.utils.TPrinter;

public class BuilderTest implements PatternTest {
    @Override
    public void patternTestLogic() {
        Director director = new Director();
        Product p = director.construct();
    }

    /**
     * 利用Director来创建有先后顺序的产品
     */
    class Director{
        private Builder builder;
        public Product construct(){
            builder = new ConcreteBuilder();
            builder.buildPart1();
            builder.buildPart2();
            Product p = builder.retrieveResult();
            return p;
        }
    }

    /**
     * 重装系统
     */
    class Product{
        boolean isSystemFormated = false;
        public void formatSystem(){
            isSystemFormated = true;
        }
        public void installationSystem(){
            if(!isSystemFormated){
                TPrinter.p("请先进行系统格式化再安装新系统！");
            }
        }
    }

    interface Builder{
        void buildPart1();
        void buildPart2();
        Product retrieveResult();
    }

    class ConcreteBuilder implements Builder{
        private Product p = new Product();
        @Override
        public void buildPart1() {
            p.formatSystem();
        }

        @Override
        public void buildPart2() {
            p.installationSystem();
        }

        @Override
        public Product retrieveResult() {
            return p;
        }
    }
}
