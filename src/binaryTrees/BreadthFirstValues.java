package binaryTrees;

import java.util.*;

public class BreadthFirstValues {

    public List<Integer> getValues(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            Node current = deque.pop();
            list.add(current.value);

            if (current.left != null) {
                deque.add(current.left);
            }
            if (current.right != null) {
                deque.add(current.right);
            }
        }
        return list;
    }

    public int getMaxValue (List<Integer> integerList) {
        return Collections.max(integerList);
    }
}