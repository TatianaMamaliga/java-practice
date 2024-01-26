package binaryTrees;

public class TreeIncludesDFS {
    public boolean isValueIncluded(Node root, Integer value) {
        if (root == null){
            return false;
        }
        if (root.value == value){
            return true;
        }
        return isValueIncluded(root.left, value) || isValueIncluded(root.right, value);
    }
}