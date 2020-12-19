package com.zb.designpattern.factory;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class FactoryOne {
    public static Productor getProdutor(){
        return new Productor();
    }
    public static Potato getPotato(){
        return new Potato();
    }
}
