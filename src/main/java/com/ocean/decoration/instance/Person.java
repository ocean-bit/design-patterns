package com.ocean.decoration.instance;
/**
 * @description 人 穿衣服打扮的例子 这个实际对应于uml中 Component ConcreteComponent 的角色
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class Person {
    /** 名字 */
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("裸奔 等衣服");
    }
}
