package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/30  9:13
 *@System Data  2021 07
 *
 */


import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
 //菜单可以有多个子菜单或者子菜单项，多个List   子菜单或者子菜单项:父类
 private List<MenuComponent> menuComponentList = new ArrayList<>();
 //构造方法
 public Menu(String name,int level) {
  this.name=name;
  this.level=level;
 }

 @Override
 public void add(MenuComponent menuComponent) {
  menuComponentList.add(menuComponent);
 }

 @Override
 public void remove(MenuComponent menuComponent) {
  menuComponentList.remove(menuComponent);
 }

 @Override
 public MenuComponent getChild(int index) {
  return  menuComponentList.get(index);
 }

 @Override
 public String getName() {
  return name;
 }

 @Override
 public void print() {
  for (int i = 0; i < level; i++) {
   System.out.print("---");
  }
  //打印菜单名称
  System.out.println(name);
  //打印子菜单名称
  for (MenuComponent menuComponent : menuComponentList) {
   menuComponent.print();
  }
 }
}
