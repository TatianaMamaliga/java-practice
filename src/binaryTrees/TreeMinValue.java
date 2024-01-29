package binaryTrees;

import java.util.Stack;

public class TreeMinValue {

    public int getMinValue(Node root) {
        int minValue = Integer.MAX_VALUE;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.value < minValue) {
                minValue = current.value;
            }
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return minValue;
    }
}