package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/6  10:39
 *@System Data  2021 08
 *
 */



//抽象被观察者角色
public interface Publicity {
    //添加观察者
    void addCareAbout(Observer observer);
    //删除观察者
    void deleteCareAbout(Observer observer);
    //推送消息
    void publicStatue(String message);

}
