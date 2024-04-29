package TimoGraphTree;

public class HTWBinaryTree<E> implements HTWTree<E> {

    private HTWBinaryTree<E> left;
    private HTWBinaryTree<E> right;

    int key;
    E value;

    public HTWBinaryTree(int k, E v){
        this.key = k;
        this.value = v;
    }

    /**
     * Returns the key of the current tree node.
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
        int hLeft = -1;
        int hRight = -1;
        if(left != null) hLeft = left.height();
        if(right != null) hRight = right.height();
        return Math.max(hLeft,hRight)+1;
    }


    /**
     * Returns the size of the current tree. The size of a tree is the number of nodes in the tree.
     *
     * @return an int representing the size of the current tree.
     */
    @Override
    public int size() {
        int size = 1;
        if(left!=null) size+= left.size();
        if(right!=null) size+= right.size();
        return size;
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
        HTWTree<E> tree = null;
        if(left!=null){
            if(left.getKey()==k)return left;
            if(left.find(k) !=null) tree = left.find(k);
        }
        if(right!=null){
            if(right.getKey()==k)return right;
            if(right.find(k) !=null) tree = right.find(k);
        }
        return tree;
    }

    //Visit first the parent, then the left child, then the right child
    public void preOrder(){
        System.out.println(this.key);
        if(this.left!=null){
            left.preOrder();
        }
        if(this.right!=null){
            right.preOrder();
        }
    }
}
