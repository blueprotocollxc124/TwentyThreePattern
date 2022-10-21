package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/9  9:58
 *@System Data  2021 08
 *
 */


public class Dog implements Animal{
    @Override
    public void accept(Human human) {
        human.interactWithDog(this);
        System.out.println("狗：快快长大，汪汪汪");
    }
}
