 
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