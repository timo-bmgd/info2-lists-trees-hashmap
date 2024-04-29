package TimoList;

public class Main {
    public static void main(String[] args) {
        //Testing the HTWArrayList
        HTWList<Integer> list = new HTWSinglyLinkedList<>();
        System.out.println(list);
        list.add(0); //index 0
        list.add(1); //index 1
        list.add(2); //index 2
        list.add(3,42);  //throws IndexOutOfBounds for index 3?
        System.out.println(list);


    }
}
