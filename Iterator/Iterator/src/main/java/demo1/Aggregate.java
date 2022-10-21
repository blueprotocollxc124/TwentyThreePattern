package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/1  9:51
 *@System Data  2021 08
 *
 */

@SuppressWarnings("all")
public interface Aggregate<E> {
 //添加一个对象
 public void addObject(E e);
 //删除一个对象
 public void removeObject(E e);
 //获取该对象的迭代器
 public Iteratorm<E> getIteratorm();
}
