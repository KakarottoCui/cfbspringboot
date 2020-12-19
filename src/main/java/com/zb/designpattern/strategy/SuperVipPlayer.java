package com.zb.designpattern.strategy;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class SuperVipPlayer implements Player {
    @Override
    public double getMoney(double originMoney) {
        return originMoney * 0.6;
    }
}
