package com.ocean.decoration.uml;

public class UMLMain {
    public static void main(String[] args) {
        // 这种用法参考 jdk IO 类
        Component componentA = new ConcreteDecoratorA(new ConcreteComponent());
        Component componentB = new ConcreteDecoratorB(new ConcreteComponent());
        // 骚一点 可以像俄罗斯套娃一样
        Component multiple = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent())));
        componentA.operation();
        System.out.println(" --------------------------------------------  --------------------------------------------- ");
        componentB.operation();
        System.out.println(" --------------------------------------------  --------------------------------------------- ");
        multiple.operation();
    }
}
