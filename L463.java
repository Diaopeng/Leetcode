
// 我的方法，1的上下左右出界或者0  result++
class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length, n = grid[0].length,result = 0;
        if(grid == null || m == 0 || n == 0) return 0;
        int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    int every = 0;
                    for(int k = 0;k < 4;k++){
                        int tx = i + dir[k][0];
                        int ty = j + dir[k][1];
                        if(tx < 0 || tx >= m || ty < 0 || ty >= n || grid[tx][ty] == 0)
                            every++;
                    }
                    result += every;
                }
            }
        }
        return result;
    }
}

//答案的方法  num * 4 - 2 *neighbor

class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int num = 0, neighbor = 0;
        if(grid == null || m == 0 || n == 0) return 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    num ++;
                    if(i < m - 1 && grid[i + 1][j] == 1) neighbor ++;
                    if(j < n - 1 && grid[i][j + 1] == 1) neighbor ++;
                }
            }
        }
        return num * 4 - neighbor * 2;
    }
}
