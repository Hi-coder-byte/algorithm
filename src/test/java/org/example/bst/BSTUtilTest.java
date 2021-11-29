package org.example.bst;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTUtilTest {

    @Test
    public void generateBinaryTree() {
        Integer[] numbs = new Integer[] {1, 2, 3, 4, null, null, 7, null, 9};
        Node root = BSTUtil.generateBinaryTree(numbs);
        BSTUtil.printBinaryTree(root);
    }
}