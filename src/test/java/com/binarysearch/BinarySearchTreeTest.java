package com.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create Class for Defining the Binary Search Tree Test
 *
 */
public class BinarySearchTreeTest {
    /**
     * @description create Method for Added Nodes to the Binary Tree
     * param: here We are Nodes to Binary Tree and checking assertion with Size
     */
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);                  //Adding Node 56 And making as a root
        myBinaryTree.add(30);                  //Adding Node 30 to tree, for root it is added as right side
        myBinaryTree.add(70);                  //Adding Node 70 to tree, for root it is added as left side
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3,size);     //Testing the size of the Tree
    }
    /**
     * @description create Main Method for Printing the Welcome Message of Binary Search Tree
     *
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Binary Search Tree Program");
    }
}
