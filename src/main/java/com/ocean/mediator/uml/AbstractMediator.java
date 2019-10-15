package com.ocean.mediator.uml;
/**
 * 抽象中介
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public abstract class AbstractMediator {
    /**
     * 得到同事对象及发送消息
     * @param msg
     * @param colleague
     */
    public abstract void send(String msg, AbstractColleague colleague);
}
