package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/31  11:17
 *@System Data  2021 07
 *
 */


import java.util.Map;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getShapeFactory();
        Map<String, AbstractShape> map = shapeFactory.getMap();
        AbstractShape i = map.get("I");
        AbstractShape o = map.get("O");
        AbstractShape a = map.get("A");


        System.out.println("形状"+i.getShape()+",颜色"+i.color);
        System.out.println("形状"+a.getShape()+",颜色"+a.color);
        System.out.println("形状"+o.getShape()+",颜色"+o.color);
    }
}
