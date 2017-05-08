 
/*
这个题目有很多解法
A： 可以考虑使用BFS 遍历树，递归返回二叉树的深度
B： 可以考虑递归的方法判断是否平衡
C：  
*/
 
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        return true;
        int left = depth(root.left);
        int right = depth(root.right);
        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int depth(TreeNode root){
        int deep = 0;
        if(root!=null){
            int left = depth(root.left);
            int right = depth(root.right);
            deep = Math.max(left,right)+1;
        }
        return deep;
    }
}

/*
C：这个解法确实很强，在递归计算高度的时候就计算得到最终的结果 
*/


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
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
        
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        
        int left = dfs(root.left);
        if(left == -1) return -1;
        int right = dfs(root.right);
        if(right == -1) return -1;
        
        if(Math.abs(left-right) > 1) return -1;
        return Math.max(left,right) + 1;
    }
   
}