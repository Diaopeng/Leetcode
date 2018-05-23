

// 使用与54题相似的方法，转圈得到结果哦
class Solution {
    public int[][] generateMatrix(int n) {
        int firRow = 0, lasRow = n-1, firCol = 0, lasCol = n-1;
        int num = 1;
        int[][] matrix = new int[n][n];
        while(firRow<=lasRow && firCol<=lasCol){
            for(int i = firCol;i <= lasCol;i++){
                matrix[firRow][i] = num++;
            }
            firRow++;
            for(int i = firRow;i <= lasRow;i++){
                matrix[i][lasCol] = num++;
            }
            lasCol--;
            if(lasRow >= firRow){
                for(int i = lasCol;i >= firCol;i--){
                    matrix[lasRow][i] = num++;
                }
            }
            lasRow--;
            if(lasCol >= firCol){
                for(int i = lasRow;i >= firRow;i--){
                    matrix[i][firCol] = num++;
                }
            }
            firCol++;
        }
        return matrix;
    }
}