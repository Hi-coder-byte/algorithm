package org.example.bst.DFS;

import org.example.bst.Node;

public class PreOrderDeepSearch {

    public void preOrderDeepSearch(Node root) {
        if (root == null) {
            return;
        }
        System.out.printf("Current node : key = %d, value = %d", root.key.intValue(), root.value.intValue());
        System.out.println();
        preOrderDeepSearch(root.left);
        preOrderDeepSearch(root.right);
    }
}
