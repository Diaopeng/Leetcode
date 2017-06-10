/*
后序遍历二叉树，使用递归和非递归的方法得到最终的解
*/
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
}
//这道题目解答过程有点复杂， 将根左右，改成根右左，最后整个倒置，就是左右根
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if(root == null)
           return result;
        while(!s.empty() || root!=null){
            while(root != null){
                s.push(root);
                result.addFirst(root.val);
                root = root.right;
            }
            root = s.pop();
            root = root.left;
        }
        return result;
    }
}