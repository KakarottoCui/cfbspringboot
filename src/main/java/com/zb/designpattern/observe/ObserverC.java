package com.zb.designpattern.observe;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class ObserverC implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("C接收到:" + msg);
    }
}
