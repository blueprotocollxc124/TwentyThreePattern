package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/4  9:21
 *@System Data  2021 08
 *
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Order {
 private int tableNumber;
 private Map<String,Integer> foodOrder = new HashMap<>();

 public Order() {
 }
 public Order(int tableNumber, Map<String, Integer> foodOrder) {
  this.tableNumber = tableNumber;
  this.foodOrder = foodOrder;
 }

 public int getTableNumber() {
  return tableNumber;
 }

 public void setTableNumber(int tableNumber) {
  this.tableNumber = tableNumber;
 }

 public Map<String, Integer> getFoodOrder() {
  return foodOrder;
 }

 public void setFoodOrder(String foodName,Integer foodCount) {
  foodOrder.put(foodName,foodCount);
 }

 public void showOrder(){
  System.out.println(tableNumber+"桌,具体订单如下：");
  Set<String> foodNames = foodOrder.keySet();
  for (String foodName : foodNames) {
   System.out.println(foodOrder.get(foodName)+"份"+foodName);
  }
  System.out.println(tableNumber+"桌,下当成功");

 }
}
