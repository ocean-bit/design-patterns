package com.ocean.abstractFactory.uml;
/**
 * @description 抽象工厂 关注的是系列产品的问题  如A B是两个实体，但是都来自mysql 或者 都来自 oracle 或者都 来自 db2
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-18
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A
     * @return
     */
    public abstract AbstractPoductA createProductA();

    /**
     * 创建产品B
     * @return
     */
    public abstract AbstractPoductB createProductB();
}
