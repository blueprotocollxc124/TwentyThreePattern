package demo2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/31  11:29
 *@System Data  2021 07
 *
 */


public abstract class AbstractBox {
    //获取图形:内部
    public abstract String getShape();

    //显示图形及颜色：外部
    public void displace(String color){
        System.out.println("方块形状："+getShape()+",颜色："+color);
    }
}
