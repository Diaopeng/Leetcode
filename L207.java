

//拓扑排序
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int len =  prerequisites.length;
        int [][] G = new int[numCourses][numCourses];
        int [] deg = new int[numCourses];
        for(int i = 0;i < len;i++){
            if(G[prerequisites[i][1]][prerequisites[i][0]] == 0)
                deg[prerequisites[i][0]]++;
            G[prerequisites[i][1]][prerequisites[i][0]] = 1;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0;i < numCourses;i++){
            if(deg[i] == 0) q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            int t = q.poll();
            for(int i = 0;i < numCourses;i++){
                if(G[t][i] == 1){
                    deg[i]--;
                    if(deg[i] ==0) q.add(i);
                }
            }
            count++;
        }
        if(count < numCourses) 
            return false;
        else 
            return true;
    }
}
