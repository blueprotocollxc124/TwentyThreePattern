package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:54
 *@System Data  2021 07
 *
 */


public class Consumer {


 public static void main(String[] args) {
  FastFood friedNoodle = new FriedNoodle();
  System.out.println(friedNoodle.getDecs() + friedNoodle.cost());

  FastFood baconFriedRice = new Bacon(new FriedRice());
  System.out.println(baconFriedRice.getDecs() + baconFriedRice.cost());

  baconFriedRice = new Egg(baconFriedRice);
  System.out.println(baconFriedRice.getDecs() + baconFriedRice.cost());
 }
}
