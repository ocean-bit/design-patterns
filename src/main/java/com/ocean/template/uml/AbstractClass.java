package com.ocean.template.uml;
/**
 * @description 模板方法模式 这个在面向对象的语言中或多或少都会使用而不自知
 * 定义一个操作算法的骨架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-22
 */
public abstract class AbstractClass {
    /**
     * 子类实现的具体操作
     */
    protected abstract void before();

    protected abstract void after();

    /**
     * 算法骨架
     */
    public void algorithm(){
        before();
        System.out.println("主要算法...");
        after();
    }
}
