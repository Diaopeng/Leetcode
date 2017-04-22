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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while(cur!=null || !stack.empty()){
			while(cur != null){
				stack.add(cur);
				cur = cur.left;
			}
			TreeNode temp = stack.pop();
			result.add(temp.val);
			cur = temp.right;
		}
		return result;
    }
}