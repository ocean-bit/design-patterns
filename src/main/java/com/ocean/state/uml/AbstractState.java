package com.ocean.state.uml;
/**
 * 抽象状态 实现类定义每个状态的行为
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public abstract class AbstractState {
    /**
     * 依据状态执行的接口
     * @param context
     */
    public abstract void handle(Context context);
}
