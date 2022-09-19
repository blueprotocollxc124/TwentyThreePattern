package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  10:05
 *@System Data  2021 07
 *
 */


public class AppleFactory implements ProductFactory{
    @Override
    public PhoneProduct producePhone() {
        return new ApplePhone();
    }

    @Override
    public IRouterProduct produceIRouter() {
        return new AppleIRouter();
    }
}
