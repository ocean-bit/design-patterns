package com.ocean.mediator.uml;
/**
 * 抽象同事
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public class AbstractColleague {
    /** 中介 */
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
