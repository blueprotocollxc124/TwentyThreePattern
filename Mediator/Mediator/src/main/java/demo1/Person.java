package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/7  10:08
 *@System Data  2021 08
 *
 */


public abstract class Person {
 private String name;
 private Mediator mediator;

 public Person(String name, Mediator mediator) {
  this.name = name;
  this.mediator = mediator;
 }
 public abstract void required(String message);

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Mediator getMediator() {
  return mediator;
 }

 public void setMediator(Mediator mediator) {
  this.mediator = mediator;
 }
}
