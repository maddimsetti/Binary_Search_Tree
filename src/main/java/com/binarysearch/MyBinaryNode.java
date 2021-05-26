package com.binarysearch;
/**
 * @description create class for defining the Binary Nodes
 *
 */
public class MyBinaryNode<K extends Comparable<K>> {
    //variables
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    /**
     * @description create constructor for Initializing the Variables of Binary Tree
     *
     */
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
