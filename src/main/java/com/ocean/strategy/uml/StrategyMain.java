package com.ocean.strategy.uml;

public class StrategyMain {
    public static void main(String[] args) {
        Context contextA = new Context("A");
        Context contextB = new Context("B");

        contextA.algorithmMethod();
        contextB.algorithmMethod();
    }
}
