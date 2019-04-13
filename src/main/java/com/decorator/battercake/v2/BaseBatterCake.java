package com.decorator.battercake.v2;

/**
 * author:曲终、人散
 * Date:2019/4/13 15:57
 */
public class BaseBatterCake extends BatterCake {
    protected String getMsg() {
        return "煎饼";
    }

    protected int getPrice() {
        return 5;
    }
}
