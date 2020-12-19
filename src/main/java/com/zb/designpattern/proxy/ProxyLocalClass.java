package com.zb.designpattern.proxy;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class ProxyLocalClass implements ProxyLocalInterface {
    @Override
    public void sayHello() {
        System.out.println("hhelo");
    }
}
