package com.ocean.decoration.uml;
/**
 * @description 具体装饰器B
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class ConcreteDecoratorB extends Decorator {
    /** 装饰器A独有属性 */
    private String prop = "BBB";

    public ConcreteDecoratorB(Component component) {
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
        System.out.println("装饰器B操作...属性：" + prop);
    }
}
