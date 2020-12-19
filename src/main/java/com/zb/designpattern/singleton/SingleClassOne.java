package com.zb.designpattern.singleton;

/**
 * 饱汉模式
 *
 * Created by cuifengbo on 2020/12/9.
 */
public class SingleClassOne {

    private static SingleClassOne singleClassOne = new SingleClassOne();

    private SingleClassOne(){}

    public static SingleClassOne getSingle(){
        return singleClassOne;
    }
}
