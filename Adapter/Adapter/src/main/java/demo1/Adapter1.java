package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/26  10:24
 *@System Data  2021 07
 *
 */

//真正的适配器   继承方式
public class Adapter1 extends NetWire implements Adapter {

    @Override
    public void getNet() {
        super.linkWorld();
    }
}
