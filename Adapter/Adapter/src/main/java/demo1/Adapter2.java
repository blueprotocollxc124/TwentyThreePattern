package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/26  10:29
 *@System Data  2021 07
 *
 */

//真正的适配器     组合(成员对象)方式
public class Adapter2 implements Adapter{
    //适配器模式一般使用组合的方式
    private NetWire netWire;

    public void setNetWire(NetWire netWire) {
        this.netWire = netWire;
    }

    @Override
    public void getNet() {
        netWire.linkWorld();
    }
}
