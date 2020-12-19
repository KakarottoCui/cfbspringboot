package com.zb.designpattern.adaper;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class AdapterTest {

    public static void main(String[] args){
        AdaInterface adaInterface = new Adapter();
        adaInterface.method1();
        adaInterface.method2();
    }
}
