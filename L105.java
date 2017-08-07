
//先序遍历找到根节点，使用根节点将中序遍历的树分成左子树和右子树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(0, 0, inorder.length - 1, preorder, inorder);
    }
    public TreeNode construct(int prestart, int instart, int inend, int[] preorder, int [] inorder){
        if(prestart > preorder.length - 1 || instart > inend)
            return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int Innode = 0;
        for(int i = instart;i <= inend;i++){
            if(inorder[i] == preorder[prestart])
                Innode = i;
        }
        root.left = construct(prestart + 1, instart,Innode - 1, preorder, inorder);
        root.right = construct(prestart + Innode - instart + 1,Innode + 1, inend, preorder, inorder);
        return root;
        
    }
}
