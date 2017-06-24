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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null)
            return result;
        q.add(root);
        int iter = 0;
        while(!q.isEmpty()){
            LinkedList<Integer> row = new LinkedList<Integer>();
            for(int i = 0,n = q.size(); i < n; i++){
                TreeNode temp = q.poll();
                if(iter % 2 == 0)
                    row.add(temp.val);
                else
                    row.addFirst(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            result.add(row);
            iter++;
        }
        return result;
    }
}
