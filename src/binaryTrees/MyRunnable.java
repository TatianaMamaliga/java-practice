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
        BreadthFirstValues breadthFirstValues = new BreadthFirstValues();
        TreeIncludesBFS treeIncludesBFS = new TreeIncludesBFS();
        TreeIncludesDFS treeIncludesDFS = new TreeIncludesDFS();
        TreeSum treeSum = new TreeSum();

        List<Integer> dfSearchValues = dfSearch.getValues(null);
        System.out.println(dfSearchValues);

        List<Integer> valuesRecursively = dfSearch.getValuesRecursively(root);
        System.out.println("Binary tree displayed using DFS: " + valuesRecursively);

        Integer maxVal1 = dfSearch.getMaxValue(root);
        System.out.println("Max value is: " + maxVal1);

        List<Integer> breadthFirstVal = breadthFirstValues.getValues(root);
        System.out.println("Binary tree displayed using BFS: " + breadthFirstVal);

        int maxVal2 = breadthFirstValues.getMaxValue(breadthFirstVal);
        System.out.println("Max value is: " + maxVal2);

        boolean isValIncludedBFS = treeIncludesBFS.isValueIncluded(root, 5);
        System.out.println(isValIncludedBFS);

        boolean isValIncludedDFS = treeIncludesDFS.isValueIncluded(root, 5);
        System.out.println(isValIncludedDFS);

        int sum = treeSum.getSum(root);
        System.out.println(sum);
    }
}