package builer2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  11:37
 *@System Data  2021 07
 *
 */


public class Waiter extends Builder{

 private Product product=null;

 public Waiter() {
  this.product = new Product();
 }


 @Override
 public Builder builderA(String msg) {
  product.setGoodA(msg);
  return this;
 }

 @Override
 public Builder builderB(String msg) {
  product.setGoodB(msg);
  return this;
 }

 @Override
 public Builder builderC(String msg) {
  product.setGoodC(msg);
  return this;
 }

 @Override
 public Builder builderD(String msg) {
  product.setGoodD(msg);
  return this;
 }

 @Override
 public Product getProduct() {
    return product;
 }
}
