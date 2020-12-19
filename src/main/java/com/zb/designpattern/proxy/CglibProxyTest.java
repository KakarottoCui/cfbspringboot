package com.zb.designpattern.proxy;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class CglibProxyTest {
    public static void main(String[] args){
        ProxyLocalClass local = new ProxyLocalClass();
        CglibProxy cglibProxy = new CglibProxy();
        ProxyLocalClass proxy = (ProxyLocalClass) cglibProxy.getInstance(local);
        proxy.sayHello();
    }
}
