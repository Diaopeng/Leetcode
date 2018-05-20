/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int res = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        helper(root,  root.val, 0);
        return res;
    }

    public void helper(TreeNode root, int val, int len){
        if(root == null) return;
        if(root.val == val+1) len++;
        else  len = 1;
        res = Math.max(res, len);
        helper(root.left, root.val, len);
        helper(root.right,root.val,len);

    }

    public void findPath( List<Integer> path, TreeNode root ) {
        if(root.left == null && roo.right == null){
            int len = 1;
            for(int i = 1;i < path.size();i++){
                if(path.get(i)-path.get(i-1) != 1){
                    res = Math.max(res, len);
                    len = 1;
                }
                else{
                    len++;
                }
            }
        }
        path.add(root.val);
        if(root.left != null) findPath(path, root.left);
        if(root.right != null) findPath( path, root.right); 
        
    }
}