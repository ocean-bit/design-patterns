package com.ocean.strategy.instance;

/**
 * 工厂模式
 */
public class CashFactory {
    public static CashSuper createCashAccept(CashSuper.CashType cashType){
        CashSuper cashSuper = null;
        if(CashSuper.CashType.NORMAL.equals(cashType)){
            cashSuper = new CashNormal();
        }else if (CashSuper.CashType.REBATE.equals(cashType)){
            // 8折写死
            cashSuper = new CashRebate(0.8);
        }else if (CashSuper.CashType.RETURN.equals(cashType)){
            // 300返100写死
            cashSuper = new CashReturn(300, 100);
        }
        return cashSuper;
    }
}
