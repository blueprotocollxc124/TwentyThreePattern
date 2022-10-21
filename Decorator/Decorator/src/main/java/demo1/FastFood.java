package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:41
 *@System Data  2021 07
 *
 */

//抽象构件：定义一个接口以规范接收附加责任的对象
public abstract class FastFood {
 private float price;
 private String decs;



 public FastFood(float price, String decs) {
  this.price = price;
  this.decs = decs;
 }

 public float getPrice() {
  return price;
 }

 public void setPrice(float price) {
  this.price = price;
 }

 public String getDecs() {
  return decs;
 }

 public void setDecs(String decs) {
  this.decs = decs;
 }

 public abstract float cost();
}
