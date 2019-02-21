package com.ocean.strategy.uml;
/**
 * @description 策略上下文 策略模式本质上完成的是算法封装 与 简单工厂的区别是 客户端只需要认识Context 完全将算法与客户端代码解耦
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class Context {
    /** 一个具体策略的引用 */
    private Strategy strategy;

    /**
     * 纯粹策略模式的构造，需要客户端代码创建具体策略
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 简单工厂 结合 策略
     * @param type
     */
    public Context(String type){
        // 工厂逻辑 创建策略对象
        if("A".equals(type)){
            strategy = new ConcreteStrategyA();
        }else if("B".equals(type)){
            strategy = new ConcreteStrategyB();
        }else {
            throw new RuntimeException("unsupport type");
        }
    }


    /**
     * 由具体策略执行算法
     */
    public void algorithmMethod(){
        strategy.algorithmMethod();
    }
}
