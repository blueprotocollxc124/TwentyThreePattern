package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:52
 *@System Data  2021 07
 *
 */


public class Egg extends Decorator{
 public Egg(FastFood fastFood) {
  super(fastFood, 1, "鸡蛋");
 }

 @Override
 public float cost() {
  return super.getPrice() + getFastFood().cost();
 }

 @Override
 public String getDecs() {
  return super.getDecs()+ getFastFood().getDecs();
 }
}
