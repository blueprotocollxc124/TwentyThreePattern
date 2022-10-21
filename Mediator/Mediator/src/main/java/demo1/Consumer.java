package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/7  10:25
 *@System Data  2021 08
 *
 */


public class Consumer {

 public static void main(String[] args) {

  RealMediator realMediator = new RealMediator();
  Owner owner = new Owner("黄牛", realMediator);
  RequestMan requestMan = new RequestMan("小明", realMediator);
  realMediator.setOwner(owner);
  realMediator.setRequestMan(requestMan);


  requestMan.required("我需要一套让人能安下心的房子！");
  owner.required("我这里有一套能让你和老婆孩子能幸福生活下去，安下住下去的房子");
 }
}
