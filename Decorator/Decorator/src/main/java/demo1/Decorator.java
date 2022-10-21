package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:49
 *@System Data  2021 07
 *
 */


public abstract class Decorator extends FastFood {
 private FastFood fastFood;

 public Decorator(FastFood fastFood,float price, String decs) {
  super(price, decs);
  this.fastFood =fastFood;
 }

 public FastFood getFastFood() {
  return fastFood;
 }

 public void setFastFood(FastFood fastFood) {
  this.fastFood = fastFood;
 }

 @Override
 public abstract float cost() ;
}
