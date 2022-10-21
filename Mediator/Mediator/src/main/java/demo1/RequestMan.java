package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/7  10:13
 *@System Data  2021 08
 *
 */


public class RequestMan extends Person{
 public RequestMan(String name, Mediator mediator) {
  super(name, mediator);
 }

 @Override
 public void required(String message) {
   getMediator().contrast(message,this);
 }
}
