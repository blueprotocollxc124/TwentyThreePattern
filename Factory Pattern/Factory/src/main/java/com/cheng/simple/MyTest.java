package com.cheng.simple;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/22  17:30
 *@System Data  2021 07
 *
 */


import org.junit.Test;

public class MyTest {
    @Test
    public void test1() {
        Shoes nike = ShoesFactory.getShoes("Nike");
        nike.name();
        Shoes adidas = ShoesFactory.getShoes("Adidas");
        adidas.name();
    }
}
