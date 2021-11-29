package org.example.leetcode.isvalidbst;

import org.example.bst.Node;

public class IsValidBST {

    /*
                    5
              1           4
           -1    2      3   6
     */

    public boolean isValidBST(Node root) {
        boolean valid = true;

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null) {
            Node maximumNode = maximum(root.left);
            valid = valid && root.key > maximumNode.key;
        }

        if (root.right != null) {
            Node minimumNode = minimum(root.right);
            valid = valid && root.key < minimumNode.key;
        }
        if (root.left != null) {
            valid = valid && isValidBST(root.left);
        }
        if (root.right != null) {
            valid = valid && isValidBST(root.right);
        }
        return valid;
    }

    public Node minimum(Node node) {
        if (node.left == null) {
            return node;
        }
        Node minimumNode = minimum(node.left);

        return minimumNode;
    }

    private Node maximum(Node node) {
        if (node.right == null) {
            return node;
        }
        Node maximumNode = maximum(node.right);

        return maximumNode;

    }
}
