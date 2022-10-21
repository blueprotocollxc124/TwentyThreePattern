package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/4  9:35
 *@System Data  2021 08
 *
 */


public class FoodCommand implements Command{

    private Cooker cooker;
    private Order order;

    public FoodCommand() {
    }

    public FoodCommand(Cooker cooker, Order order) {
        this.cooker = cooker;
        this.order = order;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.showOrder();
        cooker.cookerFood();
    }
}
