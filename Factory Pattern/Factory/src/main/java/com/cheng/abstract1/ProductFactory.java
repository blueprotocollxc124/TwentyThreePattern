package com.cheng.abstract1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/23  10:02
 *@System Data  2021 07
 *
 */


//抽象工厂的核心：

//抽象工厂：去获取抽象对象，抽象的抽象
public interface ProductFactory {

 //实现抽象类
 public PhoneProduct producePhone();
 //实现抽象类
 public IRouterProduct produceIRouter();

}
