package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/26  10:26
 *@System Data  2021 07
 *
 */


public class Test {
 public static void main(String[] args) {
  //适配器模式继承的方式：
  System.out.println("===============适配器模式继承的方式：===============");
  Computer computer = new Computer();
  NetWire netWire = new NetWire();
  Adapter1 adapter1 = new Adapter1();
  computer.online(adapter1);


  System.out.println("===============适配器模式组合的方式：===============");
  Adapter2 adapter2 = new Adapter2();
  adapter2.setNetWire(netWire);
  computer.online(adapter2);
 }
}
