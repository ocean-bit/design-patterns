package com.ocean.decoration.uml;
/**
 * @description 抽象装饰类
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public abstract class Decorator extends Component {
    /** 保留一个被装饰对象的引用 */
    protected Component component;

    /** 为了方便改造一下 */
    public Decorator(Component component) {
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 抽象操作
     */
    @Override
    public void operation() {
        if(null != component) {
            component.operation();
        }
    }
}
