package com.decorator.battercake.v2;

/**
 * author:曲终、人散
 * Date:2019/4/13 16:00
 */
public class BatterCakeEggDecorator extends BatterCakeDecorator {

    public BatterCakeEggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +" 1 个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() +1;
    }
}
