package org.example.bst.DFS;

import org.example.bst.BSTUtil;
import org.example.bst.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class MidOrderDeepSearchTest {

    @Test
    public void midOrderDeepSearch() {
        Integer[] numbs = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = BSTUtil.generateBinaryTree(numbs);
        MidOrderDeepSearch midOrderDeepSearch = new MidOrderDeepSearch();
        midOrderDeepSearch.midOrderDeepSearch(root);
//        BSTUtil.printBinaryTree(root);
    }
}