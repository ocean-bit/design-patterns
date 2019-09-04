package com.ocean.memento.uml;
/**
 * 备忘录
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Memento {
    /** 状态 */
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
