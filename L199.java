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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        if(root != null) que.add(root);
        while( !que.isEmpty()){
            for(int i = 0, n = que.size();i < n;i++){
                if( i == (n - 1)) result.add(que.peek().val);
                TreeNode temp = que.poll();
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }
        }
        return result;
    }
}
