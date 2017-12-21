
//采用之前的方法，先遍历，在求值
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
    public int sumNumbers(TreeNode root) {
        List<String> nums = new ArrayList<String>();
        if(root != null) findPaths(nums,"",root);
        int sum = 0;
        for(String s : nums){
            int num = Integer.valueOf(s);
            sum += num;
        }
        return sum;
    }
    public void findPaths(List<String> nums, String s, TreeNode root){
        if(root.left == null && root.right == null) nums.add(s + String.valueOf(root.val));
        if(root.left != null) findPaths(nums, s + String.valueOf(root.val), root.left);
        if(root.right != null) findPaths(nums, s + String.valueOf(root.val), root.right);
    }
}

// 采用现在的方法，在遍历的过程中直接求值

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
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    public int sum(TreeNode node, int s){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return s*10 + node.val;
        return sum(node.left, s*10+node.val) + sum(node.right, s*10 + node.val);
    }
}
