package com.cheng.method;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/22  18:09
 *@System Data  2021 07
 *
 */


public class AJFactory implements ShoesFactory{
 @Override
 public Shoes getShoes() {
  return new AJ();
 }
}
