package com.ocean.builder.uml;
/**
 * @description 抽象builder
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public abstract class Builder {
    /**
     * 构建A
     */
    public abstract void buildA();

    /**
     * 构建B
     */
    public abstract void buildB();

    /**
     * 结果
     * @return
     */
    public abstract Product getResult();
}
