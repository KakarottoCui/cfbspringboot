package com.zb.designpattern.adaper;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class Adapter extends AdaClass implements AdaInterface {

    @Override
    public void method2() {
        System.out.println(22);
    }
}
