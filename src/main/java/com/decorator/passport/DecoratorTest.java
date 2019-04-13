package com.decorator.passport;

import com.decorator.passport.old.SigninService;
import com.decorator.passport.upgrade.ISiginForThirdService;
import com.decorator.passport.upgrade.SiginForThirdService;
import org.springframework.cache.transaction.TransactionAwareCacheDecorator;
import org.springframework.http.server.reactive.HttpHeadResponseDecorator;

import java.io.BufferedReader;

/**
 * Created by Tom on 2019/3/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
