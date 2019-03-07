package com.ocean.builder.uml;
/**
 * @description 具体builder
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public class ConcreteBuilderA extends Builder {
    private Product product = new Product();

    @Override
    public void buildA() {
        product.add("部件A");
    }

    @Override
    public void buildB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
