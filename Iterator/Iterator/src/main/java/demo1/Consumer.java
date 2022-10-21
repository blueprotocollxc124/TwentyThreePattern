package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/1  9:58
 *@System Data  2021 08
 *
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consumer {

 public static void main(String[] args) {

  List<Student> studentList = new ArrayList<>();
  studentList.add(new Student("张三",10));
  studentList.add(new Student("李四",11));
  studentList.add(new Student("王五",12));
  studentList.add(new Student("赵六",13));
  AggregateImpl<Student> studentAggregate = new AggregateImpl<>(studentList);
  Iteratorm<Student> iteratorm = studentAggregate.getIteratorm();
  while (iteratorm.hasNext()){
   Student next = iteratorm.next();
   System.out.println(next);
  }


 }
}
