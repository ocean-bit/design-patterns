package com.ocean.strategy;

/**
 * 正常扣费
 */
public class CashNormal extends CashSuper {
    /**
     * 无折扣
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
