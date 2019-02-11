package com.ocean.strategy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 策略模式
 * 商场各类打折算法
 */
public class StrategyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("原始总价：");
        double total = scanner.nextDouble();
        System.out.println("选择折扣类型：" + Arrays.toString(CashSuper.CashType.values()));
        CashSuper.CashType cashType = CashSuper.CashType.getById(scanner.nextInt());

        // 纯简单工厂实现 假设需求不断增加 会不断修改工厂类
        CashSuper cashSuper = CashFactory.createCashAccept(cashType);
        System.out.println("纯简单工厂模式计算结果：" + cashSuper.acceptCash(total));

        // 纯策略 这里又回到了老问题 在客户端代码选择执行类
        CashContext cashContext = null;
        if(CashSuper.CashType.NORMAL.equals(cashType)){
            cashContext = new CashContext(new CashNormal());
        }else if (CashSuper.CashType.REBATE.equals(cashType)){
            // 8折写死
            cashContext = new CashContext(new CashRebate(0.8));
        }else if (CashSuper.CashType.RETURN.equals(cashType)){
            // 300返100写死
            cashContext = new CashContext(new CashReturn(300, 100));
        }
        assert cashContext != null;
        System.out.println("纯策略模式计算结果：" + cashContext.getResult(total));

        // 简单工厂与策略结合 通过context的getResult方法让具体算法与客户端进行隔离
        // 策略模式与简单工厂模式的区别在于 简单工厂需要认识两个类CashSuper CashFactory 而 策略模式只需要认识CashContext
        CashContext context = new CashContext(cashType);
        System.out.println("简单工厂与策略结合计算结果：" + context.getResult(total));

        scanner.close();
    }
}
