package com.zb.designpattern.observe;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class ObserverTestClass {

    public static void main(String[] args){
        Observer a = new ObserverA();
        Observer b = new ObserverB();
        Observer c = new ObserverC();

        TrueToObserver trueToObserver = new TrueToObserver();
        trueToObserver.registerObserver(a);
        trueToObserver.registerObserver(b);
        trueToObserver.registerObserver(c);
        trueToObserver.sendMsg("你好！");
        trueToObserver.sendMsg("find");
    }
}
