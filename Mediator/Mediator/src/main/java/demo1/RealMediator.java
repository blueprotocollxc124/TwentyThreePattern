package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/7  10:16
 *@System Data  2021 08
 *
 */


public class RealMediator extends Mediator{
 private RequestMan requestMan;
 private Owner owner;

 public RealMediator(RequestMan requestMan, Owner owner) {
  this.requestMan = requestMan;
  this.owner = owner;
 }

 public RealMediator() {
 }

 public RequestMan getRequestMan() {
  return requestMan;
 }

 public void setRequestMan(RequestMan requestMan) {
  this.requestMan = requestMan;
 }

 public Owner getOwner() {
  return owner;
 }

 public void setOwner(Owner owner) {
  this.owner = owner;
 }

 @Override
 public void contrast(String message, Person person) {
  if (person == requestMan) {
   System.out.println(owner.getName()+"收到来自"+requestMan.getName()+"的消息："+message);
  }
  if(person==owner){
   System.out.println(requestMan.getName()+"收到来自"+owner.getName()+"的消息:"+message);
  }
 }
}
