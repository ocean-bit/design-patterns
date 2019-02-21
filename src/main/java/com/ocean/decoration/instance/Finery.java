package com.ocean.decoration.instance;
/**
 * @description 服饰抽象
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public abstract class Finery extends Person {

    /** 保留对被装饰对象的引用 */
    private Person person;

    public Finery(Person person) {
        this.person = person;
    }

    @Override
    public void show(){
        person.show();
    }
}
