package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/1  9:43
 *@System Data  2021 08
 *
 */

@SuppressWarnings("all")
public interface Iteratorm<E> {
    //判断是否有下一个元素
    public boolean hasNext();

    //获取下一个元素
    public E next();

}
