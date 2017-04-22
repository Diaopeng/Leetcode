/*
递归调用的方法找到一棵树的深度
*/

public class Solution {
    public int maxDepth(TreeNode root) {
        int deep = 0;
		if(root != null){
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			deep = Math.max(left+1,right+1);
		}
		return deep;
    }
}
