package com.ocean.prototype;
/**
 * @description 原型模式 用于克隆
 * @author OuShen<ous@pvc123.com>
 * @date 2019-02-22
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Concrete concrete = new Concrete(new Object());
        try {
            Concrete concrete1 = (Concrete) concrete.clone();
            // 新建引用
            System.out.println(concrete.equals(concrete1));
            // 属性值传地址
            System.out.println(concrete.getAttr().equals(concrete1.getAttr()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 具体原型类，java中所有类的父类都是Object 对应uml图中 以Object为原型类
     * 这种克隆是浅克隆
     */
    static class Concrete implements Cloneable {
        /** 引用类型的属性 */
        private Object attr;

        public Concrete(Object attr) {
            this.attr = attr;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public Object getAttr() {
            return attr;
        }
    }
}
