package com.zb.designpattern.observe;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class ObserverA implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("A接收到:" + msg);
    }
}
