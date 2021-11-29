package org.example.bst;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BSTUtil {

    public static Node generateBinaryTree(Integer[] numbs) {
        if (numbs == null || numbs.length == 0) {
            return null;
        }
        int length = numbs.length;
        Node root = new Node(numbs[0], numbs[0]);
        buildNode(numbs, root, 0);
        return root;
    }

    private static void buildNode(Integer[] numbs, Node root, int index) {
        int length = numbs.length;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        if (leftChildIndex > length) {
            return;
        }
        if (leftChildIndex < length) {
            if (numbs[leftChildIndex] == null) {
                root.left = null;
            } else {
                Node leftChildNode = new Node(numbs[leftChildIndex], numbs[leftChildIndex]);
                root.left = leftChildNode;
                buildNode(numbs, leftChildNode, leftChildIndex);
            }
        }
        if (rightChildIndex < length) {
            if (numbs[rightChildIndex] == null) {
                root.right = null;
            } else {
                Node rightChildNode = new Node(numbs[rightChildIndex], numbs[rightChildIndex]);
                root.right = rightChildNode;
                buildNode(numbs, rightChildNode, rightChildIndex);
            }
        }

    }

    public static void printBinaryTree(Node root) {
        if (root == null) {
            return;
        }
        List<List<Integer>> allLevelNodes = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                Node node = queue.poll();
                levelNodes.add(node.key);
                if (node.left != null && node.left.key != null) {
                    queue.add(node.left);
                }
                if (node.right != null && node.right.key != null) {
                    queue.add(node.right);
                }
            }
            allLevelNodes.add(levelNodes);
        }

        for (int i = 0; i < allLevelNodes.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < allLevelNodes.get(i).size(); j++) {
                sb.append(allLevelNodes.get(i).get(j));
                sb.append(", ");
            }
            System.out.println(sb.toString());
        }
    }
}
