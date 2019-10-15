package com.ocean.mediator.uml;
/**
 * 具体同事B
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public class ConcreteColleagueB extends AbstractColleague{
    public ConcreteColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 以中介发送消息
     * @param msg
     */
    public void send(String msg){
        mediator.send(msg, this);
    }

    public void notify(String msg){
        System.out.println(String.format("同事B得到信息：%s", msg));
    }
}
