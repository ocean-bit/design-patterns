package com.ocean.factoryMethod.uml;

public class FactoryMain {
    public static void main(String[] args) {
        /**
         * 简单工厂每次扩展的时候需要修改工厂类，违背开闭原则，工厂模式刚好解决了此问题
         * 当新功能扩展时候，不改变原有的工厂类 不过好处也不是那么明显
         */
        Factory factoryA = new ConcreteFactoryA();
        Factory factoryB = new ConcreteFactoryB();
        Product productA = factoryA.create();
        Product productB = factoryB.create();
        productA.show();
        productB.show();
    }
}
