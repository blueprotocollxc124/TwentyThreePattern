package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/9  10:10
 *@System Data  2021 08
 *
 */


public class Consumer {


    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Dog());
        home.addAnimal(new Cat());
        Owner owner = new Owner();
        Others others = new Others();
        home.action(others);
    }
}
