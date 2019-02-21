package com.ocean.proxy.uml;
/**
 * @description 代理类
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class Proxy extends Subject {
    /** 真实对象引用 */
    private Subject subject;

    public Proxy() {
        // 简单处理
        this.subject = new RealSubject();
    }

    /**
     * 利用真实对象执行
     */
    @Override
    public void request() {
        System.out.println("通过代理访问");
        subject.request();
    }
}
