package com.ocean.memento.uml;
/**
 * 管理者
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
