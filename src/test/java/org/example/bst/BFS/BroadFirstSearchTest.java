package org.example.bst.BFS;

import org.example.bst.BSTUtil;
import org.example.bst.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class BroadFirstSearchTest {

    @Test
    public void search() {
        Integer[] numbs = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = BSTUtil.generateBinaryTree(numbs);
        BroadFirstSearch broadFirstSearch = new BroadFirstSearch();
        broadFirstSearch.search(root);
    }
}