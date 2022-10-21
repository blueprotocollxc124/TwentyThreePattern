package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:44
 *@System Data  2021 07
 *
 */


public class FriedRice extends FastFood{
 public FriedRice() {
  super(10,"炒饭");
 }

 @Override
 public float cost() {
  return getPrice();
 }
}
