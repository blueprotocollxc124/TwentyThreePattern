package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/6  10:48
 *@System Data  2021 08
 *
 */


public class Consumer {


 public static void main(String[] args) {
  ChinePublicity chinePublicity = new ChinePublicity();
  chinePublicity.addCareAbout(new WeChatObserver("来自世界"));
  chinePublicity.addCareAbout(new WeChatObserver("时代"));
  chinePublicity.addCareAbout(new WeChatObserver("铭创现世"));


  chinePublicity.publicStatue("今日主题：我们都在同一个世界，我们都是主宰者");
 }
}
