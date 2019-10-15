package com.ocean.mediator.uml;
/**
 * 中介者
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public class MediatorMain {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("hahahahahaha");
        colleagueB.send("heiheiheiheiheieh");
    }
}
