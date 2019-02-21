package com.ocean.simpleFactory.instance;

public class OperationSub extends Operation {
    /**
     * 减法计算
     * @return
     */
    @Override
    public double getResult() {
        return getNumA() - getNumB();
    }
}
