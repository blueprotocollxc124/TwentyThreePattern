package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  9:48
 *@System Data  2021 07
 *
 */


public class HuaweiPhone implements PhoneProduct{
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutUp() {
        System.out.println("华为手机关机");
    }

    @Override
    public void listen() {
        System.out.println("用华为手机听音乐");
    }

    @Override
    public void playGame() {
        System.out.println( "用华为手机玩游戏");
    }
}
