package com.decorator.battercake.v2;

/**
 * author:曲终、人散
 * Date:2019/4/13 16:06
 */
public class BatterCakeDecoratorTest {
    public static void main(String[] args) {

        BaseBatterCake baseBatterCake = new BaseBatterCake();
        BatterCakeDecorator batterCakeDecorator = new BatterCakeDecorator(baseBatterCake);

        batterCakeDecorator = new BatterCakeEggDecorator(batterCakeDecorator);

        batterCakeDecorator = new BatterCakeWihHotdogDecorator(batterCakeDecorator);

        batterCakeDecorator = new BatterCakeWihHotdogDecorator(batterCakeDecorator);

        System.out.println(batterCakeDecorator.getMsg() +" 的总价是： "+batterCakeDecorator.getPrice());
    }
}
