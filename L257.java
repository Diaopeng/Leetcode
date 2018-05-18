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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root!=null) getTreePaths(result, "", root);
        return result;
    }
    public void getTreePaths(List<String> result, String s, TreeNode root){
        if(root.left == null && root.right == null) result.add(s + String.valueOf(root.val));
        if(root.left != null) 
            getTreePaths(result, s + String.valueOf(root.val) + "->",root.left);
        if(root.right != null) 
            getTreePaths(result, s + String.valueOf(root.val) + "->",root.right);
    }
}
