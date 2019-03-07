package com.ocean.template.uml;

public class ConcreteB extends AbstractClass {
    /**
     * 子类实现的具体操作
     */
    @Override
    protected void before() {
        System.out.println("B的前置操作");
    }

    @Override
    protected void after() {
        System.out.println("B的后置操作");
    }
}
