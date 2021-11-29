package org.example.bst.BFS;

import org.example.bst.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BroadFirstSearch {

    public void search(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < queueSize; i++) {
                Node node = queue.poll();
                sb.append(node.key + ", ");
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
