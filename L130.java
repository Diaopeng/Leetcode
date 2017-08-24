
// 注意dfs不要访问周边的点
class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length < 2 || board[0].length < 2)
            return;
        int m = board.length,n = board[0].length;
        int [] a = {0, m - 1};
        int [] b = {0, n - 1};
        for(int i: a){
            for(int j = 0;j < n;j++){
                if(board[i][j] == 'O')
                    dfs(i,j,board);
            }
        }
        for(int i = 1;i < m - 1;i++){
            for(int j: b){
                if(board[i][j] == 'O')
                    dfs(i,j,board);
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                if(board[i][j] == '.')
                    board[i][j] = 'O';
            }
        }
    }
    
    public void dfs(int i, int j, char[][] board){
        int m = board.length,n = board[0].length;
        int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        board[i][j] = '.';
        for(int k = 0;k < 4;k++){
            int tx = i + dir[k][0];
            int ty = j + dir[k][1];
            if(tx > 0 && tx < m - 1 && ty > 0 && ty < n - 1 && board[tx][ty] == 'O')
                dfs(tx,ty,board);
        }
    }
}
