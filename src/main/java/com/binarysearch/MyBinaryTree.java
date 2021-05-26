package com.binarysearch;
/**
 * @description create Class for Defining the Binary Search Tree
 *
 */
public class MyBinaryTree<K extends Comparable<K>> {
    //variables
    private MyBinaryNode<K> root;
    /**
     * @description create Method for adding the Node to Create tree as Recursively
     */
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }
    /**
     * @description create Method for adding Nodes Recursively Making the Node with key 56 as Root
     *              and Then Node with key 30 to right of root and node with key 70 to left of root
     */
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);     //comparing the keys to positioning
        if (compareResult ==0) return current;
        if (compareResult < 0) {           //if key is less than root the new key adds to left
            current.left = addRecursively(current.left,key);
        } else {                           //if key is greater than root the new key adds to right
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    /**
     * @description create Method for getting the size of the Tree Recursively
     */
    public int getSize() {
        return this.getSizeRecursive(root);
    }

    /**
     * @description create Method for getting the size by recursively both sides of the root
     *
     */
    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                                        + this.getSizeRecursive(current.right);
    }

    /**
     * @description create Method for searching the Element in the tree recursively
     *
     */
    public boolean search(K key) {
        MyBinaryNode current = this.searchRecursively(root,key);
        if (key.equals(current.key))
            return true;
        else
            return false;
    }
    /**
     * @description create Method for Searching the Element in the tree recursively by using compareTo method
     *
     */
    private MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key) {
        while (current.key != key) {
            int compareResult = key.compareTo(current.key);
            if (compareResult == 0)
                return current;
            else if (compareResult < 0)
                current = current.left;
            else
                current = current.right;
        }
        return current;
    }

}
