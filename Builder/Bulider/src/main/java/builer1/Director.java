package builer1;/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  10:25
 *@System Data  2021 07
 *
 */

//指挥：核心。负责指挥构建一个工程，工程如何构建，由它决定
public class Director {

 //指挥工人按照顺序建房子
 public Product build(Builder builder) {
  builder.buildA();
  builder.buildB();
  builder.buildC();
  builder.buildD();
  return builder.getProduct();
 }

}
