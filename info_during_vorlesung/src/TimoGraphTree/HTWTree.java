package TimoGraphTree;

/**
 * The HTWTree interface defines the basic operations that a binary tree should have.
 *
 * @param <E> the type of the value stored in the tree nodes.
 */
public interface HTWTree<E> {

    /**
     * Returns the key of the current tree node.
     *
     * @return an int representing the key of the current node.
     */
    int getKey();

    /**
     * Returns the value stored in the current tree node.
     *
     * @return the value stored in the current node.
     */
    E getValue();

    /**
     * Returns the height of the current tree. The height of a tree is the number of edges between the tree's root and its furthest leaf.
     *
     * @return an int representing the height of the current tree.
     */
    int height();

    /**
     * Returns the size of the current tree. The size of a tree is the number of nodes in the tree.
     *
     * @return an int representing the size of the current tree.
     */
    int size();

    /**
     * Finds and returns the tree node with the given key.
     *
     * @param k the key of the tree node to be found.
     * @return the tree node with the given key.
     */
    HTWTree<E> find(int k);

}
