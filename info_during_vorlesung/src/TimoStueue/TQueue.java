package TimoStueue;

import TimoList.HTWArrayList;

import java.util.EmptyStackException;

public class TQueue<E> implements Queue<E>{

    HTWArrayList<E> list = new HTWArrayList<>();

    @Override
    public void enqueue(E e) {
        list.add(e);
    }

    @Override
    public E dequeue() {
        checkEmptyQueue();
        E t = (E)list.get(0);
        list.remove(0);
        return t;
    }

    @Override
    public E first() {
        checkEmptyQueue();
        return (E)list.get(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size()!=0;
    }

    private void checkEmptyQueue(){
        if(list.isEmpty()) throw new EmptyStackException();
    }
}
