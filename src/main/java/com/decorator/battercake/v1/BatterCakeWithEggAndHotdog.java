package com.decorator.battercake.v1;

/**
 * author:曲终、人散
 * Date:2019/4/13 15:51
 */
public class BatterCakeWithEggAndHotdog extends BatterCakeWithEgg {
    @Override
    public String getMsg() {
        return super.getMsg() +" + 1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() +2;
    }
}
