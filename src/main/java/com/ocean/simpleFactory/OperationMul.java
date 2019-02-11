package com.ocean.simpleFactory;

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
