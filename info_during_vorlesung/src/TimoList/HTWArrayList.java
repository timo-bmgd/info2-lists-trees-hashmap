package TimoList;

public class HTWArrayList<E> implements HTWList {

    private int capacity = 10;
    @SuppressWarnings("unchecked")
    private E[] a = (E[]) (new Object[capacity]);
    private int size = 0;

    @Override
    public void add(Object obj) {
        if(size==capacity){
            //This means that the array is full
            //We need to create a new array with double the size
            int oldCapacity = capacity;
            capacity *=2;
            E[] old_a = a;
            a = (E[]) (new Object[capacity]);
            System.arraycopy(old_a,0,a,0,oldCapacity);
        }
        a[size] = (E)obj;
        size++;
    }

    public void add(int index, Object o){

    }

    @Override
    public Object get(int i) {
        return a[i];
    }

    @Override
    public void remove(int i) {
        if(i==size){
            a[size] = null;

        }else{
            //Move every item of the right to the left
            for(int j = i ; j<size-1 ; j++){
                a[j] = a[j+1];
            }
        }
        size--;


    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
