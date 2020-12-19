package com.zb.designpattern.abstractfactory;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class CatFactory implements IFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
