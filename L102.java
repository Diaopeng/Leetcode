/*
使用一个队列进行BFS
*/




 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> iter = new LinkedList<TreeNode>();
        if(root == null){
            return result;
        }
        iter.offer(root);
        while(!iter.isEmpty()){
            List<Integer> row = new ArrayList<Integer>();
            for(int i = 0, n = iter.size(); i < n; i++){
                TreeNode temp = iter.poll();
                row.add(temp.val);
                if(temp.left!=null) iter.offer(temp.left);
                if(temp.right!=null)iter.offer(temp.right);
            }
            result.add(row);
        }
        return result;
    }
}