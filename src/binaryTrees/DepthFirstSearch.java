package binaryTrees;

import java.util.*;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Node root = new Node();
        root.value = 1;

        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        Node f = new Node();

        b.value = 2;
        c.value = 3;
        d.value = 4;
        e.value = 5;
        f.value = 6;

        root.left = b;
        root.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        DepthFirstSearch dfSearch = new DepthFirstSearch();
        List<Integer> list = dfSearch.getValues(null);
        System.out.println(list);

        List<Integer> objectList = dfSearch.getValuesRecursively(root);
        System.out.println(objectList);

        Integer maxVal = dfSearch.getMaxValue(root);
        System.out.println(maxVal);
    }

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