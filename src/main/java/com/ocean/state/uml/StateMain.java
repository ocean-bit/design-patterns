package com.ocean.state.uml;
/**
 * 状态模式 在java中直接使用枚举去实现可能会很爽
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class StateMain {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
