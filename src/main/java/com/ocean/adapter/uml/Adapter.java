package com.ocean.adapter.uml;
/**
 * 适配器
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        System.out.println("执行适配器逻辑");
        adaptee.specificRequest();
    }
}
