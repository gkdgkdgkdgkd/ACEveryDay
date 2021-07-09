public class Solution {
    private TreeNode newRoot = new TreeNode();
    private TreeNode temp = newRoot;
    private TreeNode preTemp = temp;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        preTemp.right = null;
        return newRoot;
    }

    private void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            temp.val = root.val;
            preTemp = temp;
            temp.right = new TreeNode();
            temp = temp.right;
            inorder(root.right);
        }
    }
}