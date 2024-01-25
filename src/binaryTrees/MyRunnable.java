package binaryTrees;

import java.util.List;

public class MyRunnable {
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
        List<Integer> dfSearchValues = dfSearch.getValues(null);
        System.out.println(dfSearchValues);

        List<Integer> valuesRecursively = dfSearch.getValuesRecursively(root);
        System.out.println("Binary tree displayed using DFS: " + valuesRecursively);

        Integer maxVal1 = dfSearch.getMaxValue(root);
        System.out.println("Max value is: " + maxVal1);

        BreadthFirstValues breadthFirstValues = new BreadthFirstValues();
        List<Integer> breadthFirstVal = breadthFirstValues.getValues(root);
        System.out.println("Binary tree displayed using BFS: " + breadthFirstVal);

        int maxVal2 = breadthFirstValues.getMaxValue(breadthFirstVal);
        System.out.println("Max value is: " + maxVal2);
    }
}