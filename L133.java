//DFS
/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        UndirectedGraphNode start = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> que = new LinkedList<UndirectedGraphNode>();
        HashMap<Integer,UndirectedGraphNode> visited = new HashMap<Integer,UndirectedGraphNode>();
        que.add(node);
        visited.put(start.label,start);
        while(!que.isEmpty()){
            UndirectedGraphNode temp = que.poll();
            for(UndirectedGraphNode neighbor: temp.neighbors){
                if(!visited.containsKey(neighbor.label)){
                    visited.put(neighbor.label, new UndirectedGraphNode(neighbor.label));
                    que.add(neighbor);
                }
                visited.get(temp.label).neighbors.add(visited.get(neighbor.label));
            }
        }
        return start;
        
    }
}


