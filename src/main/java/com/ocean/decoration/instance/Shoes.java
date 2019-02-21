package com.ocean.decoration.instance;
/**
 * @description 衬衫
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class Shoes extends Finery {
    public Shoes(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("鞋子");
    }
}
