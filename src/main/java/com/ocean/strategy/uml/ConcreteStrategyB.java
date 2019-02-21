package com.ocean.strategy.uml;

/**
 * @description 具体策略A
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class ConcreteStrategyB extends Strategy {
    /**
     * 统一的算法接口
     *
     * @return
     */
    @Override
    public void algorithmMethod() {
        System.out.println("具体策略B");
    }
}
