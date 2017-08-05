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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int depth = 0;
        if(root == null) return depth;
        q.add(root);
        while(!q.isEmpty()){
            depth++;
            for(int i = 0, n = q.size();i < n;i++){
                TreeNode temp = q.poll();
                if(temp.left == null && temp.right== null)
                    return depth;
                if(temp.left != null)  q.add(temp.left);
                if(temp.right != null)  q.add(temp.right);
            }
        }
        return 0;
    }
}
