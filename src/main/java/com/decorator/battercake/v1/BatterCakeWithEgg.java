package com.decorator.battercake.v1;

/**
 * author:曲终、人散
 * Date:2019/4/13 15:49
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getMsg() {
        return super.getMsg() +" + 1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
