package com.ocean.factoryMethod.uml;
/**
 * @description 工厂抽象
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public abstract class Factory {
    /**
     * 创建产品
     * @return
     */
    public abstract Product create();
}
