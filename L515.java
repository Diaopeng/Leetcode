//bfs 然后排序的方法

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null)
            return result;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int [] nums = new int[n];
            for(int i = 0;i < n;i++){
                TreeNode temp = q.poll();
                nums[i] = temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            Arrays.sort(nums);
            result.add(nums[n - 1]);
        }
        return result;
    }
}
