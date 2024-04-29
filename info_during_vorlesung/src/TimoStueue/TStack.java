package TimoStueue;

import TimoList.HTWArrayList;

import java.util.EmptyStackException;

public class TStack<E> implements Stack{
    HTWArrayList<E> list = new HTWArrayList<>();

    @Override
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object pop() {
        checkEmptyStack();
        E res = (E) list.get(list.size()-1);
        list.remove(list.size()-1);
        return res;
    }

    @Override
    public Object peek() {
        checkEmptyStack();
        E res = (E) list.get(list.size()-1);
        list.remove(list.size()-1);
        return res;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    private void checkEmptyStack(){
        if(list.isEmpty()) throw new EmptyStackException();
    }
}
