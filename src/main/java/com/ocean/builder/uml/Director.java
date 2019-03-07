package com.ocean.builder.uml;
/**
 * @description 导演 这个类封装了类的公共构造步骤
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public class Director {
    /**
     * 按同一步骤指挥builder干活
     * @return
     */
    public static void construct(Builder builder){
        builder.buildA();
        builder.buildB();
    }
}
