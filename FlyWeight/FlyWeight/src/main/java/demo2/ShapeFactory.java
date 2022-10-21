package demo2;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/31  11:35
 *@System Data  2021 07
 *
 */


import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
 private Map<String,AbstractBox> map;

 private ShapeFactory() {
  map = new HashMap<>();
  map.put("I",new IBox());
  map.put("O",new OBox());
  map.put("L",new LBox());
 }
 private static ShapeFactory  shapeFactory = new ShapeFactory();
 public static ShapeFactory getShapeFactory() {
  return shapeFactory;
 }
 public AbstractBox  getShape(String shape){
  return map.get(shape);
 }
}
