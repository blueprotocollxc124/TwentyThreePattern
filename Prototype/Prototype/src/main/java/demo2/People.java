package demo2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/25  9:22
 *@System Data  2021 07
 *
 */


import java.util.Date;

public class People {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video prototype = new Video("《开心说笑》",date);
        Video clone = (Video) prototype.clone();

        System.out.println(prototype);
        System.out.println(clone);
        System.out.println("============================");

        date.setTime(6548431515L);
        System.out.println(prototype);
        System.out.println(clone);
    }
}
