package TimoGraphTree;

public class HTWBinarySearchTree<E> implements HTWTree{

    private HTWBinaryTree<E> left;
    private HTWBinaryTree<E> right;

    int key;
    E value;

    public HTWBinarySearchTree(int k, E v){
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
        return 0;
    }

    /**
     * Returns the value stored in the current tree node.
     *
     * @return the value stored in the current node.
     */
    @Override
    public E getValue() {
        return null;
    }

    /**
     * Returns the height of the current tree. The height of a tree is the number of edges between the tree's root and its furthest leaf.
     *
     * @return an int representing the height of the current tree.
     */
    @Override
    public int height() {
        return 0;
    }

    /**
     * Returns the size of the current tree. The size of a tree is the number of nodes in the tree.
     *
     * @return an int representing the size of the current tree.
     */
    @Override
    public int size() {
        return 0;
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
        HTWBinarySearchTree<E> tree = null;
        if(k>key && right!=null){
            tree = (HTWBinarySearchTree<E>) right.find(k);
        }
        else if(left!=null){
            tree = (HTWBinarySearchTree<E>) left.find(k);
        }
        return tree;
    }
}
