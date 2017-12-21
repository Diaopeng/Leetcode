//DFS + DP

class Solution {
    public static int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        int result = 0;
        if(matrix.length == 0 || matrix[0].length == 0) return result;
        int [][]value = new int[matrix.length][matrix[0].length];
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                int length = DFS(matrix,i,j,value);
                if(length > result) result = length;
            }
        }
        return result;
    }
    public int DFS(int [][] matrix, int i , int j, int [][] value){
        int max = 1;
        if(value[i][j] != 0) return value[i][j];
        for(int k = 0;k < 4;k++){
            int tx = i + dir[k][0];
            int ty = j + dir[k][1];
            if(tx < 0 || tx >= matrix.length || ty < 0 || ty >= matrix[0].length || matrix[i][j] >= matrix[tx][ty]) continue;
            int length = 1 + DFS(matrix, tx, ty,value);
            max = Math.max(max, length);
        }
        value[i][j] = max;
        return max;
    }
}
