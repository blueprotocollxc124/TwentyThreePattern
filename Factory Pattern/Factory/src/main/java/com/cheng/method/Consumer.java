package com.cheng.method;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/22  18:07
 *@System Data  2021 07
 *
 */


public class Consumer {
 //消费者
 public static void main(String[] args) {
  Shoes nike = new NikeFactory().getShoes();
  nike.name();
  Shoes adidas = new AdidasFactory().getShoes();
  adidas.name();


  Shoes aj = new AJFactory().getShoes();
  aj.name();
 }
}
