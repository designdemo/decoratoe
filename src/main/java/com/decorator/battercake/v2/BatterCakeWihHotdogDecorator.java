package com.decorator.battercake.v2;

/**
 * author:曲终、人散
 * Date:2019/4/13 16:03
 */
public class BatterCakeWihHotdogDecorator extends BatterCakeDecorator {
    public BatterCakeWihHotdogDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +" 1 个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
