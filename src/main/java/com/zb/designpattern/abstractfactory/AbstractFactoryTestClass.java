package com.zb.designpattern.abstractfactory;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class AbstractFactoryTestClass {

    public static void main(String[] args){
        IFactory iFactory = new DogFactory();
        iFactory.getAnimal();
    }
}
