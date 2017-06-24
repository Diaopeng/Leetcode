/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//参考答案的解法，将递归的值再写return 语句中，一层一层的返回
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isEqual(root.left, root.right);

    }
    public boolean isEqual(TreeNode left, TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val)
            return false;
        return isEqual(left.left, right.right) && isEqual(left.right, right.left);
    }
}
