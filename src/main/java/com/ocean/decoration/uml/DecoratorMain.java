package com.ocean.decoration.uml;
/**
 * @description 装饰模式是为已有功能动态地添加更多功能的一种方式 客户端代码可以有需要 有顺序地装饰对象
 * 有效把类的核心职责和装饰功能区分，去除相关类的重复逻辑。但使用的时候需要注意相关顺序
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class DecoratorMain {
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
