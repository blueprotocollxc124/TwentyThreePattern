package builer1;/*
 *
 *@Author  liu
 *@Creat Time   2021/7/24  10:16
 *@System Data  2021 07
 *
 */

//抽象的创建者，是一个抽象的类：定义看抽象方法，或者接口
public abstract class Builder {
 public abstract void buildA();
 public abstract void buildB();
 public abstract void buildC();
 public abstract void buildD();
//经过ABCD四步之后完工：得到产品
 public abstract Product getProduct();
}
