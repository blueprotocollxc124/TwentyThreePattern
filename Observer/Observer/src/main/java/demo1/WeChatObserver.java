package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/6  10:46
 *@System Data  2021 08
 *
 */


public class WeChatObserver implements Observer{

 private String WeChatName;

 public WeChatObserver(String weChatName) {
  WeChatName = weChatName;
 }

 @Override
 public void update(String message) {
  System.out.println(WeChatName+"收到来着公众号的消息："+message);
 }
}
