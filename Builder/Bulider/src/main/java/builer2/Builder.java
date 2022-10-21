package builer2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  11:33
 *@System Data  2021 07
 *
 */


public  abstract class Builder {

    public abstract Builder builderA(String msg);
    public abstract Builder builderB(String msg);
    public abstract Builder builderC(String msg);
    public abstract Builder builderD(String msg);

    public abstract Product getProduct();
}
