public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {
    public int closestValue(TreeNode root, double target) {
        int res = root.val;
        double diff = Math.abs(root.val - target);
        while(root != null){
            if(Math.abs(root.val - target) < diff){
                res = root.val;
                diff = Math.abs(root.val - target);
            }
            if(root.val > target) root = root.left;
            else root= root.right;
        }
        return res;
    }
}