package builer1;/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  10:22
 *@System Data  2021 07
 *
 */


public class Worker extends Builder{

 private Product product;

 public Worker() {
  this.product = new Product();
 }

 @Override
 public void buildA() {
  product.setBuildA("打地基");
  System.out.println(product.getBuildA());
 }

 @Override
 public void buildB() {
  product.setBuildB("钢筋水泥");
  System.out.println(product.getBuildB());
 }

 @Override
 public void buildC() {
  product.setBuildC("铺电线");
  System.out.println(product.getBuildC());
 }

 @Override
 public void buildD() {
  product.setBuildD("粉刷");
  System.out.println(product.getBuildD());
 }

 @Override
 public Product getProduct() {
  return product;
 }
}
