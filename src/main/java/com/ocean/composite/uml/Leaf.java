package com.ocean.composite.uml;

/**
 * 叶子节点
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Leaf extends AbstractComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent c) {
        throw new UnsupportedOperationException("叶子不能操作节点");
    }

    @Override
    public void remove(AbstractComponent c) {
        throw new UnsupportedOperationException("叶子不能操作节点");
    }

    @Override
    public void display(int depth) {
        System.out.println(String.format("%s name:%s", prefix(depth), name));
    }
}
