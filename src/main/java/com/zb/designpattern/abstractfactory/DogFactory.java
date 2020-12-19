package com.zb.designpattern.abstractfactory;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class DogFactory implements IFactory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
