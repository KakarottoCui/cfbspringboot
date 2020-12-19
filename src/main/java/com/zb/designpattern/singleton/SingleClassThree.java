package com.zb.designpattern.singleton;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public enum SingleClassThree {
    Single;

    //readResolve to prevent another instance of Singleton
    private Object readResolve(){
        return Single;
    }

}
