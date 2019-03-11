package com.ocean.observer.uml;

public class ObserverMain {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.setState("init");

        subject.attach(new ConcreteObserver(subject, "ob1", subject.getState()));
        subject.attach(new ConcreteObserver(subject, "ob2", subject.getState()));
        subject.attach(new ConcreteObserver(subject, "ob3", subject.getState()));

        subject.setState("running");
        subject.notifyAllList();

        subject.setState("end");
        subject.notifyAllList();
    }
}
