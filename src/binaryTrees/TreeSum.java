package binaryTrees;

public class TreeSum {

    public int getSum(Node root) {
        if (root == null) return 0;

        return root.value + getSum(root.left) + getSum(root.right);
    }
}