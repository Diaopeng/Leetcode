

//使用深度优先搜索的方式搜索连通块的数目
public class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0|| grid[0].length == 0) return 0;
        int len = grid.length,wid = grid[0].length;
        int cou = 0;
        for(int i = 0;i < len;i++){
            for (int j = 0;j < wid;j++){
                if( grid[i][j] == '1'){
                    dfs(i,j,grid);
                    ++cou;
                }
            }
        }
        return cou;
    }
    public void dfs(int x, int y, char[][] grid){
        int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int len = grid.length,wid = grid[0].length;
        for(int i = 0;i < 4;i++){
            int tx = x + dir[i][0];
            int ty = y + dir[i][1];
            if(tx >= 0 && tx <len && ty >= 0 && ty < wid && grid[tx][ty] == '1' ){
                grid[tx][ty] = '0';
                dfs(tx,ty,grid);
            }
        }
    }
}
