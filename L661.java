class Solution {
    public int[][] imageSmoother(int[][] M) {
        int [][] dir = {{0,-1},{0,1},{0,0},{-1,-1},{-1,0},{-1,1},{1,-1},{1,0},{1,1}} ;
        int m = M.length,  n = M[0].length;
        int [][] result = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j =0;j < n;j++){
                int sum = 0, count = 0;
                for(int k = 0;k < 9;k++){
                    int tx = i + dir[k][0];
                    int ty = j + dir[k][1];
                    if(tx >= 0 && tx < m && ty >= 0 && ty < n){
                        sum += M[tx][ty];
                        count++;
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
