package com.ocean.simpleFactory.uml;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        AbstractComponent componentA = SimpleFactory.createComponent("A");
        AbstractComponent componentB = SimpleFactory.createComponent("B");
        System.out.println(componentA.toString());
        System.out.println(componentB.toString());
    }
}
