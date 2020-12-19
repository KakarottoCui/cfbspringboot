package com.zb.designpattern.build;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class Director {
    public static void main(String[] args){
        Person person = BuildClass.createBuild()
                .buildHead("tou")
                .buildBody("shenti")
                .buildFoot("jiao")
                .build();
    }
}
