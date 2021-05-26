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
     * @description create Method for Added Nodes to the Binary Tree
     * param: here We are Nodes to Binary Tree and checking assertion with Size
     */
    @Test
    public void given13NumbersWhenAddedToBinaryTreeShouldReturnSizeThirteen() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);                  //Adding Node 56 And making as a root
        myBinaryTree.add(30);                  //Adding Node 30 to tree, for root it is added as right side
        myBinaryTree.add(70);                  //Adding Node 70 to tree, for root it is added as left side
        myBinaryTree.add(22);                  //Adding Node 22 to tree, Now 30 become root and the key added as left side
        myBinaryTree.add(40);                  //Adding Node 40 to tree, Now 30 become root and the key added as right side
        myBinaryTree.add(11);                  //Adding Node 11 to Node 22 and become Node 11 as root
        myBinaryTree.add(3);                   //Adding Node 3 to tree, Now 22 become root and the key added as left side
        myBinaryTree.add(16);                  //Adding Node 16 to tree, Now 22 become root and the key added as right side
        myBinaryTree.add(60);                  //Adding Node 60 to tree, Now 70 become root and the key added as left side
        myBinaryTree.add(95);                  //Adding Node 95 to tree, Now 70 become root and the key added as right side
        myBinaryTree.add(65);                  //Adding Node 65 to Node 60 and become Node 65 as root
        myBinaryTree.add(63);                  //Adding Node 63 to tree, Now 65 become root and the key added as left side
        myBinaryTree.add(67);                  //Adding Node 67 to tree, Now 65 become root and the key added as right side
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13,size);     //Testing the size of the Tree
    }

    /**
     * @description create Method for Added Nodes to the Binary Tree
     * param: here We are Nodes to Binary Tree and checking assertion with Size
     */
    @Test
    public void givenNumbersWhenSearchingTheElementInBinaryTreeShouldPassBinaryTreeTrue() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);                  //Adding Node 56 And making as a root
        myBinaryTree.add(30);                  //Adding Node 30 to tree, for root it is added as right side
        myBinaryTree.add(70);                  //Adding Node 70 to tree, for root it is added as left side
        myBinaryTree.add(22);                  //Adding Node 22 to tree, Now 30 become root and the key added as left side
        myBinaryTree.add(40);                  //Adding Node 40 to tree, Now 30 become root and the key added as right side
        myBinaryTree.add(11);                  //Adding Node 11 to Node 22 and become Node 11 as root
        myBinaryTree.add(3);                   //Adding Node 3 to tree, Now 22 become root and the key added as left side
        myBinaryTree.add(16);                  //Adding Node 16 to tree, Now 22 become root and the key added as right side
        myBinaryTree.add(60);                  //Adding Node 60 to tree, Now 70 become root and the key added as left side
        myBinaryTree.add(95);                  //Adding Node 95 to tree, Now 70 become root and the key added as right side
        myBinaryTree.add(65);                  //Adding Node 65 to Node 60 and become Node 65 as root
        myBinaryTree.add(63);                  //Adding Node 63 to tree, Now 65 become root and the key added as left side
        myBinaryTree.add(67);                  //Adding Node 67 to tree, Now 65 become root and the key added as right side
        boolean result = myBinaryTree.search(63);
        Assertions.assertTrue(result);     //Testing for searching the element in the Tree
    }
    /**
     * @description create Main Method for Printing the Welcome Message of Binary Search Tree
     *
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Binary Search Tree Program");
    }
}
