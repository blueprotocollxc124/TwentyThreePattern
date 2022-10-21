package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/4  9:45
 *@System Data  2021 08
 *
 */


import java.util.ArrayList;
import java.util.List;

public class Waitress {
    List<Order> orderList = new ArrayList<>();
    public void addOrder(Order order){
        orderList.add(order);
    }

    public void orderUp() {
        System.out.println("订单来了，请尽快进行制作");
        for (Order order : orderList) {
            order.showOrder();
        }
    }
}
