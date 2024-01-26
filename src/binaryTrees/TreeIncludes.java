package binaryTrees;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeIncludes {
    public boolean isValueIncluded(Node root, Integer value) {

        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            Node current = deque.pop();
            if (current.value == value) {
                return true;
            }

            if (current.left != null) {
                deque.add(current.left);
            }
            if (current.right != null) {
                deque.add(current.right);
            }
        }
        return false;
    }
}