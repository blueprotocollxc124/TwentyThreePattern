package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/6  10:44
 *@System Data  2021 08
 *
 */

import java.util.ArrayList;
import java.util.List;

//具体被观察者角色
public class ChinePublicity implements Publicity{
 private List<Observer> observerList = new ArrayList<>();

 @Override
 public void addCareAbout(Observer observer) {
  observerList.add(observer);
 }

 @Override
 public void deleteCareAbout(Observer observer) {
 observerList.remove(observer);
 }

 @Override
 public void publicStatue(String message) {
  for (Observer observer : observerList) {
   observer.update(message);
  }
 }
}
