package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/28  11:53
 *@System Data  2021 07
 *
 */


public class Bacon extends Decorator{
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return super.getPrice()+getFastFood().getPrice();
    }

    @Override
    public String getDecs() {
        return super.getDecs()+getFastFood().getDecs();
    }
}
