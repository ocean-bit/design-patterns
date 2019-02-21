package com.ocean.simpleFactory.instance;

/**
 * 计算算法的抽象父类
 */
public abstract class Operation {
    private double numA;
    private double numB;

    /** -------------------------------------------- 子类实现的抽象方法 --------------------------------------------- */

    /**
     *子类实现的计算方式
     * @return
     */
    public abstract double getResult();
    /** -------------------------------------------- getter && setter --------------------------------------------- */
    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
