package com.ocean.strategy;

/**
 * 策略模式上下文 封装变化点
 * 策略模式：定义了算法家族，分别封装，让他们可以相互替换，该模式让算法的变化不影响使用算法的客户
 */
public class CashContext {
    private CashSuper cashSuper;

    /**
     * 构造时传入具体策略
     * @param cashSuper
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 与简单工厂结合
     */
    public CashContext(CashSuper.CashType cashType) {
        // ps. 这里的工厂模式不是一定要抽成一个单独类
        // ps. 想彻底除去工厂模式的if else 或者switch 靠反射大法了
        CashSuper cs = CashFactory.createCashAccept(cashType);
        this.cashSuper = cs;
    }

    public double getResult(double money){
        // ps. 相比较简单工厂返回计算类的做法，这里直接返回计算结果给客户端，减少客户端耦合
        return cashSuper.acceptCash(money);
    }
}
