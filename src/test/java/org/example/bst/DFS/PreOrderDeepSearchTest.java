package org.example.bst.DFS;

import org.example.bst.BSTUtil;
import org.example.bst.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class PreOrderDeepSearchTest {

    @Test
    public void preOrderDeepSearch() {
        Integer[] numbs = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};
        Node root = BSTUtil.generateBinaryTree(numbs);
        PreOrderDeepSearch preOrderDeepSearch = new PreOrderDeepSearch();
        preOrderDeepSearch.preOrderDeepSearch(root);
    }
}