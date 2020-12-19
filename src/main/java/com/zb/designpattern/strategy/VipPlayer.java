package com.zb.designpattern.strategy;

/**
 * Created by cuifengbo on 2020/12/9.
 */
public class VipPlayer implements Player {
    @Override
    public double getMoney(double originMoney) {
        return originMoney * 0.9;
    }
}
