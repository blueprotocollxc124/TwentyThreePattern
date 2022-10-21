package com.cheng.pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/20  21:24
 *@System Data  2021 07
 *
 */


public class Bank {
 //单例模式之饿汉式的设计步骤：
 //1.私有化类的构造器
 //2.内部创建类的私用、静态对象
 //3.通过静态方法获取这个对象

 //第一种单例模式：饿汉式的实现
 private static Bank instance = new Bank();
 private Bank() {

 }
 public static Bank getInstance() {
  return instance;
 }
 

}
