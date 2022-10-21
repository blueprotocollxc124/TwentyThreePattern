package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/7/29  10:57
 *@System Data  2021 07
 *
 */


public class Consumer {

 public static void main(String[] args) {
  IntelligentSound intelligentSound = new IntelligentSound();
  intelligentSound.on("打开空调");
  intelligentSound.off("关闭空调");
  System.out.println("===============================");
  intelligentSound.on("打开全部");
  System.out.println("===============================");
  intelligentSound.off("关闭全部");
  System.out.println("===============================");
  intelligentSound.on("为啥打发士大夫撒多灯");

 }
}
