package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/31  11:08
 *@System Data  2021 07
 *
 */


import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
 private static Map<String, AbstractShape> map ;
 private static ShapeFactory shapeFactory = new ShapeFactory();
 private ShapeFactory() {
     map=new HashMap<>();
     map.put("I",new I("Blue"));
     map.put("O",new O("White"));
     map.put("A",new A("Black"));
 }
 public static ShapeFactory getShapeFactory() {
  return shapeFactory;
 }

 public static Map<String, AbstractShape> getMap() {
  return map;
 }
}