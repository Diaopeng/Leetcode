/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode iter, int sum) {
        if(iter == null ) return false;
        if(iter.left == null && iter.right == null && sum - iter.val == 0) return true;
        return hasPathSum(iter.left, sum - iter.val) || hasPathSum(iter.right, sum - iter.val);
    }
}
