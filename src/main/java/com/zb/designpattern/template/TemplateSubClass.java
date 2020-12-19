package com.zb.designpattern.template;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class TemplateSubClass extends TemplateClass {

    public void method1(){
        System.out.println(1);
        baseMethod();
    }

    public void method2(){
        System.out.println(2);
        baseMethod();
    }

    public static void main(String[] args){
        TemplateSubClass templateSubClass = new TemplateSubClass();
        templateSubClass.method1();
        templateSubClass.method2();
    }
}
