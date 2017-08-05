

// 使用DFS进行搜索，得到需要的值
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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int result = 0;
        if(root == null)
            return result;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0;i < n;i++){
                TreeNode temp = q.poll();
                if(i == 0) result = temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return result;
    }
}
