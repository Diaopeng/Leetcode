import java.util.ArrayList;
import java.util.PriorityQueue;

import javax.lang.model.util.ElementScanner6;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }


 class Pair{
    int val;
    double diff;
    public Pair(int val, double diff){
        this.val = val;
        this.diff = diff;
    }
}
public class Solution {
   public List<Integer> closestKValues(TreeNode root, double target, int k) {
       PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>(){
           
           //new PriorityQueue<Double>(k, new Comparator<Double>() {
           public int compare(Pair a, Pair b) {
               if(a.diff > b.diff) 
                   return 1;
               else if(a.diff < b.diff)
                   return -1;
               else 
                   return 0;
           }
       });
       List<Integer> res = new ArrayList<>();
       dfs(pq,root,target);
       for(int i = 0;i < k;i++){
           res.add(pq.poll().val);
       }
       return res;
   }
   public void dfs(PriorityQueue<Pair> pq, TreeNode root,double target){
       if(root == null) return;
       Pair pair = new Pair(root.val, Math.abs(root.val-target));
       pq.add(pair);
       dfs(pq,root.left, target);
       dfs(pq, root.right, target);
   }
}