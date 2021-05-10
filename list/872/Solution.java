public class Solution {
    private int [] arr = new int[201];
    private int len1 = 0;
    private int len2 = 0;

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        f1(root1);
        f2(root2);
        return len1 == len2;
    }

    private void f1(TreeNode root){
        if(root != null){
            if(root.left == null && root.right == null){
                arr[len1++] = root.val;
            }
            f1(root.left);
            f1(root.right);
        }
    }

    private void f2(TreeNode root){
        if(root != null){
            if(root.left == null && root.right == null){
                if(arr[len2] == root.val){
                    ++len2;
                }else{
                    if(len2 == len1){
                        ++len2;
                    }
                    return;
                }
            }
            f2(root.left);
            f2(root.right);
        }
    }
}