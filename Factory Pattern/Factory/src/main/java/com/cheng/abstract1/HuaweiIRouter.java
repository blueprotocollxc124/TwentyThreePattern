package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  9:57
 *@System Data  2021 07
 *
 */


public class HuaweiIRouter implements IRouterProduct{
 @Override
 public void open() {
  System.out.println("华为路由器打开Wi-Fi");
 }

 @Override
 public void setting() {
  System.out.println("华为路由器设置");
 }

 @Override
 public void link() {
  System.out.println("华为路由器联网");
 }
}
