/*
这个解法的想法就是广度优先，然后把得到的result倒置就可以了
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<List<Integer>> finalresult = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null)
        return result;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> row = new ArrayList<Integer>();
            for(int i = 0,n = q.size(); i < n;i++){
                TreeNode temp = q.poll();
                if(temp.left != null)q.add(temp.left);
                if(temp.right != null)q.add(temp.right);
                row.add(temp.val);
            }
            result.add(row);
        }
        for(int i = result.size() - 1; i >= 0;i--){
            finalresult.add(result.get(i));
        }
        return finalresult;
    }
}