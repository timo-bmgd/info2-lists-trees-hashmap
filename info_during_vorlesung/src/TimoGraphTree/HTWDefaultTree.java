package TimoGraphTree;

import java.util.LinkedList;
import java.util.List;

public class HTWDefaultTree<E> implements HTWTree<E> {

    private int key;
    private E value;
    private List<HTWDefaultTree<E>> children;

    public HTWDefaultTree(int key, E value){
        this.key = key;
        this.value = value;
        children = new LinkedList<>();
    }

    public void addChild(HTWDefaultTree<E> child){
        children.add(child);
    }

    /**
     * Returns the key of the current tree node. Key == index.
     *
     * @return an int representing the key of the current node.
     */
    @Override
    public int getKey() {
        return key;
    }

    /**
     * Returns the value stored in the current tree node.
     *
     * @return the value stored in the current node.
     */
    @Override
    public E getValue() {
        return value;
    }

    /**
     * Returns the height of the current tree. The height of a tree is the number of edges between the tree's root and its furthest leaf.
     *
     * @return an int representing the height of the current tree.
     */
    @Override
    public int height() {
        if(children.isEmpty()) return 0;

        int h = -1;
        for(HTWDefaultTree<E> child : children){
            if(child.height()>h){
                h = child.height();
            }
        }
        return h+1;
    }

    /**
     * Returns the size of the current tree. The size of a tree is the number of nodes in the tree.
     *
     * @return an int representing the size of the current tree.
     */
    @Override
    public int size() {

        int childrenSize = 0;
        for(HTWDefaultTree<E> child: children) {
            HTWDefaultTree<E> child1 = child;
            childrenSize += child1.size(); //if a child has child
        }
        return childrenSize; //all children + itself
    }

    /**
     * Finds and returns the tree node with the given key.
     *
     * @param k the key of the tree node to be found.
     * @return the tree node with the given key.
     */
    @Override
    public HTWTree<E> find(int k) {
        if(key==k) return this;
        for(HTWDefaultTree<E> child : children){
            if(child.getKey()==k) return child;
            if(child.children.size()!=0)
                if(child.find(k)!=null) return child.find(k);
        }
        return null;
    }
}
