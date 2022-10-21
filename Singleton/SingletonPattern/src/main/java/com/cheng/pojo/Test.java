package com.cheng.pojo;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/20  21:31
 *@System Data  2021 07
 *
 */


public class Test {
	  
	  public static void main(String[] args) {
			
			for (int i = 0; i < 10000; i++) {
				  new Thread(() -> {
						Bank instance = Bank.getInstance();
						System.out.println(instance);
				  }).start();
			}
	  }
}
