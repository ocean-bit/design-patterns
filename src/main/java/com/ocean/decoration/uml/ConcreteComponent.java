package com.ocean.decoration.uml;
/**
 * @description 具体的被装饰对象
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-21
 */
public class ConcreteComponent extends Component {
    /**
     * 操作
     */
    @Override
    public void operation() {
        System.out.println("被装饰对象的具体操作...");
    }
}
