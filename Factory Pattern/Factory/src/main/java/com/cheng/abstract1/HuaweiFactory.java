package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  10:04
 *@System Data  2021 07
 *
 */


public class HuaweiFactory implements ProductFactory{
    @Override
    public PhoneProduct producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct produceIRouter() {
        return new HuaweiIRouter();
    }
}
