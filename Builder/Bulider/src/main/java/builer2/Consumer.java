package builer2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  11:47
 *@System Data  2021 07
 *
 */


public class Consumer {

 public static void main(String[] args) {
  Waiter waiter = new Waiter();
  //链式编程：在原来的基础上，可以自由组合了，如果不组合，也有默认的套餐
  Product product = waiter.builderA("巨无霸").builderB("甜筒").builderC("蜜汁鸡")
          .getProduct();
  System.out.println(product);
 }
}
