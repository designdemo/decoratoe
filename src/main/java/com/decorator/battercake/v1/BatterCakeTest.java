package com.decorator.battercake.v1;

/**
 * author:曲终、人散
 * Date:2019/4/13 15:52
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() +" 的价格是："+batterCake.getPrice());

        batterCake = new BatterCakeWithEgg();
        System.out.println(batterCake.getMsg() +" 的价格是："+batterCake.getPrice());

        batterCake = new BatterCakeWithEggAndHotdog();
        System.out.println(batterCake.getMsg() +" 的价格是："+batterCake.getPrice());
    }

}
