package com.ocean.composite.uml;
/**
 * 此类为组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为
 * @author ocean <ous@pvc123.com>
 * @date 2019-09-04
 */
public abstract class AbstractComponent {
    /** name */
    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    protected String prefix(int depth){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    /**
     * 新增 树叶或树枝
     * @param c
     */
    public abstract void add(AbstractComponent c);

    /**
     * 删除 树叶或树枝
     * @param c
     */
    public abstract void remove(AbstractComponent c);

    /**
     * 展示
     * @param depth 深度？
     */
    public abstract void display(int depth);
}
