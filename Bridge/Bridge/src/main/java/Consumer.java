/*
 *
 *@Author  liu
 *@Creat Time   2021/7/27  9:32
 *@System Data  2021 07
 *
 */


public class Consumer {

    public static void main(String[] args) {
        //通过装配的模式来实现，这就是设计模式的魅力
        //联想台式
        Computer computer1 = new Desktop(new Lenovo());
        computer1.info();

        //苹果笔记本
        Computer computer2 = new Laptop(new Apple());
        computer2.info();




      System.out.println("=======================================");
        System.out.println("增加一个类型：平板,可以使得三个品牌都增加了这个类型");
       //增加一个类型：平板,可以使得三个品牌都增加了这个类型
        //戴尔平板
        Computer computer3 = new Tablet(new Dell());
        computer3.info();

        Computer computer4 = new Tablet(new Apple());
        computer4.info();

        Computer computer5 = new Tablet(new Lenovo());
        computer5.info();

        System.out.println("=======================================");
        System.out.println("增加一个品牌：华为,可以使得这个品牌都拥有这三种类型");
        Computer computer6 = new Desktop(new Huawei());
        computer6.info();
        Computer computer7 = new Laptop(new Huawei());
        computer7.info();
        Computer computer8 = new Tablet(new Huawei());
        computer8.info();


















    }
}
