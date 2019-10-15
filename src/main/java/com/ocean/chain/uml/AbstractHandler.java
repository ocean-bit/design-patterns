package com.ocean.chain.uml;
/**
 * Handler 定义处理接口
 * @author ocean <ous@pvc123.com>
 * @date 2019-10-15
 */
public abstract class AbstractHandler {
    /** 继任者 */
    public AbstractHandler successor;

    /**
     * 必须指定继任者的构造函数
     * @param successor
     */
    public AbstractHandler(AbstractHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     * @param i 参数
     */
    public abstract void handleReq(int i);
}
