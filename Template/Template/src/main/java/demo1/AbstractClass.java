package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/2  9:28
 *@System Data  2021 08
 *
 */

//模板方法模式  抽象类提供了模板方法、具体方法和抽象方法(学习abstract的抽象，final的学习和类中调方法，子类少掉了父类的方法)
public abstract class AbstractClass {
    //模板方法模式的关键：模板方法,由于不能让继承的子类重新，所以定义成final,抽象方法即使还没有实现，也可以调
    //在这个模板中已经定义了炒菜的这种步骤，所以子类不需要关心如何对它进行翻炒，只需要去实现父类给他们的两个抽象的方法，分别指定
    //倒的蔬菜和倒的调味料是什么即可
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSeasoner();
        fry();
    }

    //倒油是一样，所以直接实现
    public void  pourOil(){
        System.out.println("倒油");
    }
    //热油是一样，所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }
    //倒的蔬菜是不一样的，具体还得看实现类，所以将其抽象出来
    public abstract  void pourVegetable();
    //倒的调味料也是不一样的，具体还得看实现类，所以也将其抽象出来
    public abstract  void pourSeasoner();
    //炒的过程是一样的，所以直接实现
    public void fry(){
        System.out.println("炒啊炒，炒熟它！");
    }
}
