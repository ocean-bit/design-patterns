package com.ocean.strategy.instance;

/**
 * 满减计算
 */
public class CashReturn extends CashSuper {
    /** 满减条件 */
    private double condition;
    /** 满减返回 */
    private double moneyReturn;

    /**
     * 构造必须带有这俩
     * @param condition
     * @param moneyReturn
     */
    public CashReturn(double condition, double moneyReturn) {
        this.condition = condition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 满减
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= condition){
            result = money - (int)(money / condition) * moneyReturn;
        }
        return result;
    }
}
