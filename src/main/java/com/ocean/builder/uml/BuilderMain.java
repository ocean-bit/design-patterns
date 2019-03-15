package com.ocean.builder.uml;
/**
 * @description 建造者模式 主要用于创建一些复杂的对象，这些对象内部的构建顺序和部件数量通常是稳定的，但对象内部的构造通常面临复杂变化
 * 从类图看与策略模式相似，与策略模式区别有：
 *  1.策略模式是行为模式，封装的是算法行为，降低类之间的耦合度；建造者是创建型，用来创建复杂对象。
 *  2.策略模式的抽象仅仅定义了一个算法接口，其具体实现千差万别；建造者的抽象则已经定义了建造的骨架，具体建造者必须按照定义好的骨架构造对象
 *  3.策略模式通过Context提供上下文维护具体策略，建造者通过Director获取对象，Director隐藏对象构造步骤。
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public class BuilderMain {
    public static void main(String[] args) {
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        // 按照骨架建造对象
        Director.construct(builderA);
        Director.construct(builderB);

        builderA.getResult().show();
        builderB.getResult().show();

    }
}
