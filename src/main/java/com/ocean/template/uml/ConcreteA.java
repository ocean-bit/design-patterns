package com.ocean.template.uml;

public class ConcreteA extends AbstractClass {
    /**
     * 子类实现的具体操作
     */
    @Override
    protected void before() {
        System.out.println("A的前置操作");
    }

    @Override
    protected void after() {
        System.out.println("A的后置操作");
    }
}
