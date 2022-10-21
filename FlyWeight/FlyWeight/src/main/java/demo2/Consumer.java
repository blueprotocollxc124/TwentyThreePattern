package demo2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/31  11:44
 *@System Data  2021 07
 *
 */


public class Consumer {


 public static void main(String[] args) {
  ShapeFactory shapeFactory = ShapeFactory.getShapeFactory();
  AbstractBox i = shapeFactory.getShape("I");
  i.displace("Black");
  AbstractBox o = shapeFactory.getShape("O");
  o.displace("White");
  AbstractBox l = shapeFactory.getShape("L");
  l.displace("Red");
 }
}
