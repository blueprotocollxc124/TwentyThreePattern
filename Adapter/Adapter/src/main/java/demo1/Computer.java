package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/26  10:20
 *@System Data  2021 07
 *
 */

//电脑    目标对象
public class Computer {
 public void online(Adapter adapter) {
  System.out.print("电脑适配适配器接到");
  adapter.getNet();
 }
}
