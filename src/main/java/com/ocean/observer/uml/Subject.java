package com.ocean.observer.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 观察者 抽象主题
 * @author OuShen<ous@pvc123.com>
 * @date 2019-03-07
 */
public abstract class Subject {
    /** 观察者列表 */
    List<Observer> list = new ArrayList<Observer>();
    /** 添加观察者 */
    public void attach(Observer observer){
        list.add(observer);
    }
    /** 删除观察者 */
    public void Detach(Observer observer){
        list.remove(observer);
    }
    /** 通知观察者 */
    public void notifyAllList(){
        list.forEach(Observer::notyfied);
    }
}
