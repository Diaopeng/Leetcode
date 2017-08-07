
//bfs计算距离，使用一个矩阵保存所有的距离并且返回
public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int [][] dis = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                dis[i][j] = bfs(i*n+j, matrix);
            }
        }
        return dis;
    }
        
        int bfs(int pos,int [][] matrix){
            int m = matrix.length, n = matrix[0].length;
            int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(pos);
            int dis = 0;
            while(!q.isEmpty()){
                for(int i = 0,num = q.size(); i < num;i++){
                    int t = q.poll();
                    if(matrix[t/n][t%n] == 0)
                        return dis;
                    for(int j = 0;j < 4;j++){
                        int tx = t/n + dir[j][0];
                        int ty = t%n + dir[j][1];
                        if(tx >= 0 && tx < m && ty >= 0 && ty < n)
                            q.add(tx * n + ty); 
                    }
                }
                dis++;
            }
            return dis;
        }
}
