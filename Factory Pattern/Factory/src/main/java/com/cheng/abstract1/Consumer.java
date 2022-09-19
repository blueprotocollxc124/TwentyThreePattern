package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  10:06
 *@System Data  2021 07
 *
 */


public class Consumer {


    public static void main(String[] args) {
        System.out.println("=============HUAWEI=============");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        PhoneProduct huaweiPhone = huaweiFactory.producePhone();
        IRouterProduct huaweiIRouter = huaweiFactory.produceIRouter();
        huaweiPhone.open();
        huaweiPhone.listen();

        huaweiIRouter.open();
        huaweiIRouter.setting();
        huaweiIRouter.link();
        System.out.println("=============APPLE=============");
        AppleFactory appleFactory = new AppleFactory();
        PhoneProduct applePhone = appleFactory.producePhone();
        IRouterProduct appleIRouter = appleFactory.produceIRouter();
        applePhone.open();
        applePhone.playGame();

        appleIRouter.open();
        appleIRouter.link();

    }
}
