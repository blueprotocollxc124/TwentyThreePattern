package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/1  9:46
 *@System Data  2021 08
 *
 */

import java.util.List;

@SuppressWarnings("all")
public class IteratormImpl<E> implements Iteratorm<E>{
 private List<E> eList;
 int position;

 public IteratormImpl() {
 }

 public IteratormImpl(List<E> eList) {
  this.eList = eList;
 }

 @Override
 public boolean hasNext() {
  return position<eList.size();
 }

 @Override
 public E next() {
  E e = eList.get(position);
  position++;
  return e;
 }
}
