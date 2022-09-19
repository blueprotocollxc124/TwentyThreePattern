package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  10:00
 *@System Data  2021 07
 *
 */


public class AppleIRouter implements IRouterProduct{
    @Override
    public void open() {
        System.out.println("Apple路由器打开Wi-Fi");
    }

    @Override
    public void setting() {
        System.out.println("Apple路由器设置");
    }

    @Override
    public void link() {
        System.out.println("Apple路由器联网");
    }
}
