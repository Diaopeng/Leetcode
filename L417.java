//逆向DFS
class Solution {
    private int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> result = new ArrayList<int[]>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;
        
        int len = matrix.length, wid = matrix[0].length;
        boolean[][] Pacific = new boolean[len][wid];
        boolean[][] Atlantic = new boolean[len][wid];
        
        for(int i = 0;i < len;i++){
            DFS(matrix, Pacific,i,0);
            DFS(matrix, Atlantic, i,wid-1);
        }
        for(int i = 0;i < wid;i++){
            DFS(matrix, Pacific, 0,i);
            DFS(matrix, Atlantic, len-1,i);
        }
        
        for(int i = 0;i < len;i++){
            for(int j = 0;j < wid;j++){
                if(Pacific[i][j] && Atlantic[i][j])
                    result.add(new int[] {i,j});
            }
        }
        return result;
    }
    
    public void DFS(int[][] matrix,boolean[][] visited,int x, int y){
        
        int len = matrix.length, wid = matrix[0].length;
        visited[x][y] = true;
        for(int i = 0;i < 4;i++){
            int tx = x + dir[i][0];
            int ty = y + dir[i][1];
            if(tx >= 0 && ty >= 0 && tx < len && ty < wid && matrix[tx][ty] >= matrix[x][y] && !visited[tx][ty])
                DFS(matrix,visited, tx,ty);
        }
        /*
        
        int n = matrix.length, m = matrix[0].length;
        if(x<0 || x>=n || y<0 || y>=m || visited[x][y] || matrix[x][y] < compare)
            return;
        visited[x][y] = true;
        for(int[]d:dir){
            dfs(matrix, visited, matrix[x][y], x+d[0], y+d[1]);
        }
        */
    }
}
