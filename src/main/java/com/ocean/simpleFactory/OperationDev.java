package com.ocean.simpleFactory;

public class OperationDev extends Operation {
    /**
     * 乘法计算
     * @return
     */
    @Override
    public double getResult() {
        if (getNumB() != 0){
            return getNumA() / getNumB();
        }
        throw new RuntimeException("除数不得为0");
    }
}
