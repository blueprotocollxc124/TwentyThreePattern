package builer1;/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  10:31
 *@System Data  2021 07
 *
 */


public class Consumer {

 public static void main(String[] args) {
  Director director = new Director();
  Product product = director.build(new Worker());
  System.out.println(product.toString());


 }
}
