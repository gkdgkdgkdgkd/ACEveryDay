public class Solution {
    private int min = 10_0000;
    public int minDiffInBST(TreeNode root) {
        f(root);
        return min;
    }

    private void f(TreeNode root){
        if(root != null){
            min = Math.min(Math.min(Math.abs(root.val - rightChild(root.left)),Math.abs(root.val - leftChild(root.right))),min);
            f(root.left);
            f(root.right);
        }
    }

    private int rightChild(TreeNode root){
        int temp = 10_0000;
        while(root != null){
            temp = root.val;
            root = root.right;
        }
        return temp;
    }

    private int leftChild(TreeNode root){
        int temp = 10_0000;
        while (root != null){
            temp = root.val;
            root = root.left;
        }
        return temp;
    }
}