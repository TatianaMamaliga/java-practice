package binaryTrees;

import java.util.*;

public class DepthFirstSearch {

    public List<Integer> getValues(Node root){
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            list.add(current.value);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
        return list;
    }

    // recursive solution
    public List<Integer> getValuesRecursively(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(root.value);

        List<Integer> leftVal = getValuesRecursively(root.left);
        List<Integer> rightVal = getValuesRecursively(root.right);

        integerList.addAll(leftVal);
        integerList.addAll(rightVal);

        return integerList;
    }

    // get maximum value
    public Integer getMaxValue(Node root) {
        List<Integer> integerList = getValuesRecursively(root);
        return Collections.max(integerList);
    }
}