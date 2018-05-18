import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> s = new Stack<>();
        boolean flag = false;
        TreeNode cur = root;
        while(cur != null && !s.isEmpty()){
            while(cur != null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            if(flag) return cur;
            if(cur == p) flag = true;
            cur = cur.right;
        }
        return null;
            
        
    }
}