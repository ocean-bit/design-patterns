package com.ocean.abstractFactory.uml;
/**
 * @description 系列1 具体工厂
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-18
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractPoductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractPoductB createProductB() {
        return new ProductB1();
    }
}
