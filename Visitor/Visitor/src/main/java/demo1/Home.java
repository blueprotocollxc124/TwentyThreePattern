package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/9  10:07
 *@System Data  2021 08
 *
 */


import java.util.ArrayList;
import java.util.List;

public class Home {
 private List<Animal> animalList = new ArrayList<>();

 public void addAnimal(Animal animal){
  animalList.add(animal);
 }

 public void action(Human human){
  for (Animal animal : animalList) {
   animal.accept(human);
  }
 }
}
