package TimoList;

import java.util.Objects;

public class HTWSinglyLinkedList<E> implements HTWList{

    SinglyLinkedNode<E> head = null;
    private int size = 0;

    @Override
    public void add(Object obj) {
        SinglyLinkedNode<E> o = new SinglyLinkedNode<>();
        o.value = (E)obj;
        if(this.head==null) head = o;
        else{
            SinglyLinkedNode<E> itr = head;
            while(itr.next!=null){
                itr = itr.next;
            }
            itr.next = o;
        }
        size++;
    }

    public void add(int desiredIndex, Object o){
        SinglyLinkedNode<E> itr = head;
        int searchIndex = 0;
        while(itr.next!=null){
            if(searchIndex+1 == desiredIndex) {
                SinglyLinkedNode<E> obj = new SinglyLinkedNode<>();
                obj.value = (E) o;
                obj.next = itr.next;
                itr.next = obj;
                return;
            }
            itr = itr.next;
            searchIndex++;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Object get(int index) {
        //CHECK IF INDEX IS VALID
        Objects.checkIndex(index,size);
        //"itr" IS THE LOOP VARIABLE : GET THE CORRECT LINKED-NODE OBJECT
        if(head!=null){
            SinglyLinkedNode<E> itr = head;
            for(int j = 0; j<index ; j++){
                itr = itr.next;
            }
            //RETURN ITS VALUE
            return itr.value;
        }
        return null;

    }

    @Override
    public void remove(int index) {
        //CHECK IF INDEX IS VALID
        Objects.checkIndex(index,size);
        //"itr" IS THE ELEMENT BEFORE THE ELEMENT THAT WE WANT TO REMOVE
        SinglyLinkedNode<E> before = head;

        for(int j = 0; j<index-1 ; j++){
            Objects.requireNonNull(before.next, "SEARCH STOPPED AT INDEX " + j);
            before = before.next;
        }
        if(before.next.next!=null){
            before.next = before.next.next;
        }else{
            before.next = null;
        }
        size--;

    }

    public boolean contains(Object o){
        SinglyLinkedNode<E> itr = new SinglyLinkedNode<>();
        itr = this.head;
        while(itr.next!=null){
            if(itr.value.equals(o)) return true;
            itr = itr.next;
        }
        return false;
    }

    public int indexOf(Object o){
        SinglyLinkedNode<E> itr = new SinglyLinkedNode<>();
        int index = 0;
        itr = this.head;
        while(itr.next!=null){
            if(itr.value.equals(o)) return index;
            itr = itr.next;
            index++;
        }
        return -1;
    }

    @Override
    public String toString(){
        String r = "[";

        //"itr" IS THE LOOP VARIABLE : GET THE CORRECT LINKED-NODE OBJECT
        if(head!=null){
            SinglyLinkedNode<E> itr = head;
            r+=itr.value.toString()+" ";
            while(itr.next!=null){
                itr = itr.next;
                r+=itr.value.toString()+" ";
            }
        }

        return (r+"]");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}


