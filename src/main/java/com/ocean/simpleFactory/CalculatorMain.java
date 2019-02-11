package com.ocean.simpleFactory;

import java.util.Scanner;

/**
 * 大话设计模式 计算器 简单工厂实现
 */
public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("输入1个运算符 + - * / ：");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        System.out.println("输入数字a：");
        double a = scanner.nextDouble();
        System.out.println("输入数字b：");
        double b = scanner.nextDouble();
        Operation operation = OperationFactory.createOperation(symbol);
        operation.setNumA(a);
        operation.setNumB(b);
        System.out.println("运算：" + a + " " + symbol + " " + b + " = " + operation.getResult());
        scanner.close();
    }
}
