package com.ocean.simpleFactory.instance;

public class OperationAdd extends Operation {
    /**
     * 加法计算
     * @return
     */
    @Override
    public double getResult() {
        return getNumA() + getNumB();
    }
}
