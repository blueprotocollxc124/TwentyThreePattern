package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/3  9:00
 *@System Data  2021 08
 *
 */


public class Waiter {
    private Strategy strategy;

    public Waiter() {
    }

    public Waiter(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
