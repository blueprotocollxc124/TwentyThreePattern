package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/3  8:59
 *@System Data  2021 08
 *
 */


public class StrategyC implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("满1000免费拿硬件少于200块的商品");
    }
}
