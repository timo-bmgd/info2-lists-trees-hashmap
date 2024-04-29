package TimoList;

public interface HTWList <E>{

    public void add ( E obj ); // add an element at the end of the list

    public void add ( int index, E obj ); // add an element at the end of the list

    public E get ( int i );

    public void remove ( int i );

    public int size ();

    public boolean isEmpty ();

}
