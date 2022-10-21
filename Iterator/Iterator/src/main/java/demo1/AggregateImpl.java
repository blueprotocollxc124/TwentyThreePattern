package demo1;

/*
 *
 *@Author  liu
 *@Creat Time   2021/8/1  9:53
 *@System Data  2021 08
 *
 */


import java.util.List;

public class AggregateImpl<E> implements Aggregate<E> {
    private List<E> eList;



    public AggregateImpl(List<E> eList) {
        this.eList = eList;
    }

    @Override
    public void addObject(E e) {
        eList.add(e);
    }

    @Override
    public void removeObject(E e) {
        eList.remove(e);
    }

    @Override
    public Iteratorm<E> getIteratorm() {
        IteratormImpl<E> iteratorm = new IteratormImpl(eList);
        return iteratorm;
    }
}
