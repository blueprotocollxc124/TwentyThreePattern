package com.cheng.simple;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/22  17:32
 *@System Data  2021 07
 *
 */


public class ShoesFactory {

    //静态工厂模式，又趁为简单工厂
    //方式一：
   public static Shoes getShoes(String shoesName){
      if("Nike".equals(shoesName)){
             return new Nike();
     }else if("Adidas".equals(shoesName)){
            return new Adidas();
     }
      else {
            return null;
           }
 }


    //方式二：
    public static Shoes getNike() {
       return new Nike();
    }
    public static Shoes getAdidas() {
       return new Adidas();
    }
    public static Shoes getAJ() {
       return new AJ();
    }
}
