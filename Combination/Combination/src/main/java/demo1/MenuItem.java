package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/30  9:24
 *@System Data  2021 07
 *
 */


public class MenuItem extends MenuComponent{
 public MenuItem(String name,int level){
  this.name=name;
  this.level=level;
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
  System.out.println(name);
 }
}
