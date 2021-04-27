public class Solution {
    private int sum = 0;
    private int low;
    private int high;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        f(root);
        return sum;
    }

    private void f(TreeNode root){
        if(root != null){
            int temp = root.val;
            if(temp >= low && temp <= high){
                sum += temp;
            }
            if(root.right != null){
                if(root.right.val <= high){
                    f(root.right);
                }else{
                    f(root.right.left);
                }
            }
            if(root.left != null){
                if(root.left.val >= low){
                    f(root.left);
                }else{
                    f(root.left.right);
                }
            }
        }
    }
}