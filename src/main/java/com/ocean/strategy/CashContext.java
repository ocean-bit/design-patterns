package com.ocean.strategy;

/**
 * 策略模式上下文
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
        return cashSuper.acceptCash(money);
    }
}
