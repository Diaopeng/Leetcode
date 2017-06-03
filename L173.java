public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        PushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
        
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        PushAll(temp.right);
        return temp.val;
    }
    
    public void PushAll(TreeNode node){
        while(node!=null){
            stack.add(node);
            node = node.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */