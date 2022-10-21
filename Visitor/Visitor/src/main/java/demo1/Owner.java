package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/9  10:03
 *@System Data  2021 08
 *
 */


public class Owner implements Human{
    @Override
    public void interactWithDog(Dog dog) {
        System.out.println("主人和狗狗玩耍");
    }

    @Override
    public void interactWithCat(Cat cat) {
        System.out.println("主人和小猫玩耍");
    }
}
