package com.ocean.chain.uml;

import java.util.Objects;

/**
  * 继任A
  * @author ocean <ous@pvc123.com>
  * @date 2019-10-15
  */
public class ConcreteHandlerA extends AbstractHandler {
     /**
      * 必须指定继任者的构造函数
      * @param successor
      */
     public ConcreteHandlerA(AbstractHandler successor) {
         super(successor);
     }

     @Override
    public void handleReq(int i) {
         if(i<10){
             System.out.println(String.format("i<10, 由继任者%s处理", this.getClass().getSimpleName()));
         }else if(Objects.nonNull(successor)){
             successor.handleReq(i);
         }
    }
}
