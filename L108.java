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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        TreeNode root = transform(nums,0,nums.length - 1);
        return root;
        
    }
    public TreeNode transform(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = transform(nums, left, mid - 1);
        root.right = transform(nums, mid + 1, right);
        return root;
    }
}
