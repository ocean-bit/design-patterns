package com.ocean.simpleFactory;

/**
 * 计算方法工厂类
 */
public class OperationFactory {
    /**
     * @param symbol 运算符
     * @return
     */
    public static Operation createOperation(String symbol){
        Operation operation = null;
        // 这里是不是有坑 每次都要修改工厂类
        if("+".equals(symbol)){
            operation = new OperationAdd();
        }else if ("-".equals(symbol)){
            operation = new OperationSub();
        }else if ("*".equals(symbol)){
            operation = new OperationMul();
        }else if ("/".equals(symbol)){
            operation = new OperationDev();
        }
        if(null == operation){
            throw new RuntimeException("不支持的运算符:" + symbol);
        }
        return operation;
    }
}
