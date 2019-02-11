package com.ocean.simpleFactory;

/**
 * 计算方法工厂类
 * 简单工厂：旨在解决对象的创建问题
 */
public class OperationFactory {
    /**
     * @param symbol 运算符
     * @return
     */
    public static Operation createOperation(String symbol){
        Operation operation = null;
        // 简单工厂的好处是 利用面向对象封装特性，使每个计算方式得到复用，修改其中任意算法，不影响其他算法
        // TODO 不过这里是不是有坑 每次都要修改工厂类导致重新部署 移步策略模式寻求解决方案
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
