package TimoStueue;

public interface Stack <E>{
    /**
     * adds e to top of the stack
     * @param e to be added to the top of the stack
     */
    void push(E e);

    /**
     * removes an element from the top of the stack an returns it and usually provides some convenience methods
     * @return top element that was removed
     */
    E pop();

    /**
     *
     * @return the element on the top without removing it
     */
    E peek();

    /**
     *
     * @return the current size of the stack
     */
    int size();

    /**
     *
     * @return true if the stack is empty
     */
    boolean isEmpty();
}
