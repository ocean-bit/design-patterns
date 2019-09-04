package com.ocean.memento.uml;
/**
 * 发起人，负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。
 * Originator可根据需要雪顶Memento存储Originator的哪些内部状态
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Originator {
    /** 状态 */
    private String state;

    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    /**
     * 从备忘录恢复
     * @param memento 要恢复的副本
     */
    public void setMemento(Memento memento){
        setState(memento.getState());
    }

    /**
     * 显示状态
     */
    public void show(){
        System.out.println(String.format("state:%s", getState()));
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
