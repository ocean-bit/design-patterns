package com.ocean.simpleFactory.instance;

public class OperationMul extends Operation {
    /**
     * 乘法计算
     * @return
     */
    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }
}
