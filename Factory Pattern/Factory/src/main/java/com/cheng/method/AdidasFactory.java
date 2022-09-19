package com.cheng.method;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/22  18:07
 *@System Data  2021 07
 *
 */


public class AdidasFactory implements ShoesFactory{
    @Override
    public Shoes getShoes() {
        return new Adidas();
    }
}
