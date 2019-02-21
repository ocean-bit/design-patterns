package com.ocean.simpleFactory.uml;
/**
 * @description 具体组件
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class ConcreteComponentA extends AbstractComponent{
    /**
     * 操作
     */
    @Override
    public void operation() {
        System.out.println("组件A");
    }

    @Override
    public String toString() {
        return "ConcreteComponentA{}";
    }
}
