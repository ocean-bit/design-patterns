package com.ocean.state.uml;
/**
 * 具体状态A
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class ConcreteStateA extends AbstractState {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
