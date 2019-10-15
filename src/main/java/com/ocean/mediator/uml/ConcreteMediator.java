package com.ocean.mediator.uml;
/**
 * 具体中介者
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public class ConcreteMediator extends AbstractMediator {
    /** 同事A */
    private ConcreteColleagueA colleagueA;
    /** 同事B */
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void send(String msg, AbstractColleague colleague) {
        if(colleague.equals(colleagueA)){
            colleagueB.notify(msg);
        }else {
            colleagueA.notify(msg);
        }
    }
}
