package com.ocean.strategy.instance;

/**
 * 折扣
 */
public class CashRebate extends CashSuper {
    private double moneyRebate;
    /**
     * 构造设定折扣
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    /**
     * 折扣
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }


}
