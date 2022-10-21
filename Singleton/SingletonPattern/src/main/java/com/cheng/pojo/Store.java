package com.cheng.pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/20  21:37
 *@System Data  2021 07
 *
 */


public class Store {

 //单例模式：懒汉式实现
 private  static Store instance = null;
 private Store() {

 }
 public static Store getInstance() {
  if (instance == null) {
   instance = new Store();
  }
   return instance;
 }
}
