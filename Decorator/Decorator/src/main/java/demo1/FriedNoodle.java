package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:48
 *@System Data  2021 07
 *
 */


public class FriedNoodle extends  FastFood{
 public FriedNoodle() {
  super(12, "炒面");
 }

 @Override
 public float cost() {
  return getPrice();
 }
}
