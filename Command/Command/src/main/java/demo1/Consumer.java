package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/4  9:20
 *@System Data  2021 08
 *
 */


public class Consumer {


 public static void main(String[] args) {


  Order order = new Order();
  order.setTableNumber(1);
  order.setFoodOrder("巴西烤肉饭",2);
  order.setFoodOrder("肥牛烧腊饭",1);
  order.setFoodOrder("大瓶可乐",1);

  Order order1 = new Order();
  order1.setTableNumber(2);
  order1.setFoodOrder("蜜汁鸡扒饭",2);
  order1.setFoodOrder("酱香牛腩饭",1);
  order1.setFoodOrder("小瓶雪碧",1);

  Waitress waitress = new Waitress();
  waitress.addOrder(order);
  waitress.addOrder(order1);

  waitress.orderUp();


 }
}
