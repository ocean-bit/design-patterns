package com.ocean.simpleFactory.uml;
/**
 * 简单工厂 解决对象创建问题
 * @description 
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class SimpleFactory {
    public static AbstractComponent createComponent(String type){
        // todo 如何使用反射把这些if else省略了？？
        AbstractComponent component;
        if("A".equals(type)){
            component = new ConcreteComponentA();
        }else if ("B".equals(type)){
            component =  new ConcreteComponentB();
        }else {
            throw new RuntimeException("unsupport type");
        }
        return component;
    }
}
