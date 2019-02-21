package com.ocean.decoration.uml;

public class ConcreteDecoratorA extends Decorator {
    /** 装饰器A独有属性 */
    private String prop = "AAA";

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 抽象操作
     */
    @Override
    public void operation() {
        // 先执行基类的
        super.operation();
        // 执行装饰器的功能
        printProp();
    }

    /**
     * 具体装饰器A独有
     */
    private void printProp(){
        System.out.println("装饰器A操作...属性：" + prop);
    }
}
