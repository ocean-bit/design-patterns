package com.ocean.facade.uml;
/**
 * @description 外观/门面 模式 经典应用就是mvc的三层结构 层与层之间通过单个外观访问
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-06
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("-- 方法组A --");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodB(){
        System.out.println("-- 方法组B --");
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }
}
