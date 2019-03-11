package com.ocean.observer.uml;

public class ConcreteObserver extends Observer {
    /** 主题 */
    private ConcreteSubject subject;
    /** 名字 */
    private String name;
    /** state */
    private String state;

    public ConcreteObserver(ConcreteSubject subject, String name, String state) {
        this.subject = subject;
        this.name = name;
        this.state = state;
    }

    @Override
    public void notyfied() {
        System.out.println("name: " + name + ", state 从: " + state + " 切换为 " + subject.getState());
        state = subject.getState();
    }
}
