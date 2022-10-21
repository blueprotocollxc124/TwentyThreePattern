package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/3  9:01
 *@System Data  2021 08
 *
 */


public class Consumer {


 public static void main(String[] args) {
  Waiter waiter = new Waiter(new StrategyA());
  waiter.getStrategy().strategyMethod();
  System.out.println("====================");
  waiter.setStrategy(new StrategyB());
  waiter.getStrategy().strategyMethod();
  System.out.println("====================");
  waiter.setStrategy(new StrategyC());
  waiter.getStrategy().strategyMethod();
 }
}
