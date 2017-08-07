

//编程是注意少犯小错误
public class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        int m = board.length, n = board[0].length;
        
        if(board[x][y] == 'M'){
            board[x][y] = 'X';
            return board;
        }
        
        int count = 0;
        for(int i = -1;i <= 1;i++){
            for(int j = -1;j <= 1;j++){
                if(i == 0 && j == 0) continue;
                int tx = x + i, ty = y + j;
                if(tx >= 0 && tx < m && ty >= 0 && ty < n && (board[tx][ty] == 'M' || board[tx][ty] == 'X'))
                    count++;
            }
        }
        
        if(count > 0)
            board[x][y] = (char)(count + '0');
        else{
            board[x][y] = 'B';
            for(int i = -1;i <= 1;i++){
                for(int j = -1;j <= 1;j++){
                    if(i == 0 && j == 0) continue;
                    int tx = x + i, ty = y + j;
                    if (tx >= 0 && tx < m && ty >= 0 && ty < n && board[tx][ty] == 'E') 
                        updateBoard(board, new int[] {tx, ty});
                }
            }
        }
        return board;
        
        
    }
}
