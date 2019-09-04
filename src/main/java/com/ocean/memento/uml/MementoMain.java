package com.ocean.memento.uml;
/**
 * 备忘录模式 用得很少 感觉很鸡肋 应该前端富文本编辑器常用
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并于对象之外保存这个状态。之后可以将对象恢复到之前保存的状态
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class MementoMain {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("on");
        o.show();

        // 存档管理员
        Caretaker c = new Caretaker();
        // 创建存档
        c.setMemento(o.createMemento());

        o.setState("off");
        o.show();

        // 从存档恢复
        o.setMemento(c.getMemento());
    }
}
