package binaryTrees;

public class MaxSumPath {
    public int getMaxSumPath(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        if (root.left == null && root.right == null) {
            return root.value;
        }
        int maxChildPathSum = Math.max(getMaxSumPath(root.left), getMaxSumPath(root.right));

        return root.value + maxChildPathSum;
    }
}