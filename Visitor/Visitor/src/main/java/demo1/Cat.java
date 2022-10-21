package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/9  9:59
 *@System Data  2021 08
 *
 */


public class Cat implements Animal{
 @Override
 public void accept(Human human) {
  human.interactWithCat(this);
  System.out.println("猫：越来越可爱，喵喵喵");
 }
}
