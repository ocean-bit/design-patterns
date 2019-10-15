package com.ocean.chain.uml;
/**
 * 责任链
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public class ChainMain {
    public static void main(String[] args) {
        AbstractHandler handler = new ConcreteHandlerA(new ConcreteHandlerB(null));
        handler.handleReq(1);
        handler.handleReq(10);
    }
}
