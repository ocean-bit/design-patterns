package com.ocean.state.uml;
/**
 * 上下文 维护一个state实例 定义当前状态
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Context {
    /** 状态 */
    private AbstractState state;

    public Context(AbstractState state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        System.out.println(String.format("当前状态为%s，变更状态为%s", this.state.getClass().getSimpleName(), state.getClass().getSimpleName()));
        this.state = state;
    }
}
