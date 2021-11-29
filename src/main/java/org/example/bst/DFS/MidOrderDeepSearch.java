package org.example.bst.DFS;

import org.example.bst.Node;

public class MidOrderDeepSearch {

    public void midOrderDeepSearch(Node root) {
        if (root == null) {
            return;
        }
        midOrderDeepSearch(root.left);
        System.out.print(root.key + ", ");
        midOrderDeepSearch(root.right);
    }
}
