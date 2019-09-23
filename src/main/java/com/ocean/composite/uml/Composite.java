package com.ocean.composite.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public class Composite extends AbstractComponent {
    /** 子节点集合 */
    private List<AbstractComponent> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent c) {
        children.add(c);
    }

    @Override
    public void remove(AbstractComponent c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.format("%s name:%s", prefix(depth), name));
        children.forEach(abstractComponent -> abstractComponent.display(depth + 2));
    }
}
