package com.ocean.builder.uml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description 产品
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public class Product {
    /** 部件 */
    private List<String> parts = new ArrayList<String>();

    /**
     * 添加部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * show
     */
    public void show(){
        System.out.println(Arrays.toString(parts.toArray()));
    }
}
