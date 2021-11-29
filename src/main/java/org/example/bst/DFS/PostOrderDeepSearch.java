package org.example.bst.DFS;

import org.example.bst.Node;

public class PostOrderDeepSearch {

    public void postOrderDeepSearch(Node root) {
        if (root == null) {
            return;
        }
        postOrderDeepSearch(root.left);
        postOrderDeepSearch(root.right);
        System.out.print(root.key + ", ");
    }
}
