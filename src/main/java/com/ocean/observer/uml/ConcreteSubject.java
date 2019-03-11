package com.ocean.observer.uml;
/**
 * @description 具体主题 加入特有属性
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public class ConcreteSubject extends Subject {
    /** 具体状态 */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
