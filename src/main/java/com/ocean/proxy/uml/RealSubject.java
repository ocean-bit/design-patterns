package com.ocean.proxy.uml;
/**
 * @description 真是对象
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class RealSubject extends Subject {
    /**
     * 共有接口
     */
    @Override
    public void request() {
        System.out.println("真实对象请求");
    }
}
