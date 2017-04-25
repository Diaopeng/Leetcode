 /*
 
可以中序遍历二叉树，然后看得到的序列是不是一个严格递增的序列，如果是的话，那就表明这是一个BST。
下面还会再给出递归中序遍历二叉树的解法
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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode iter = root;
        while(iter != null || !s.empty()){
            while(iter != null){
                s.add(iter);
                iter = iter.left;
            }
            TreeNode temp = s.pop();
            result.add(temp.val);
            iter = temp.right;
        }
        for(int i = 0;i < result.size() - 1;i++){
            if(result.get(i) >= result.get(i+1)){
                return false;
            }
        }
        return true;
    }
}