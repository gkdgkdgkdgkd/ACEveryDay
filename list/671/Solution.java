public class Solution {
    private int rootValue;
    private int res = -1;
    public int findSecondMinimumValue(TreeNode root) {
        rootValue = root.val;
        preorder(root);
        return res;
    }

    private void preorder(TreeNode root){
        if(root == null || (res != -1 && root.val >= res)){
            return;
        }
        if(root.val > rootValue){
            res = root.val;
        }
        preorder(root.left);
        preorder(root.right);
    }
}