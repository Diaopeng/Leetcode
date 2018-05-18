

// 79题一直过不了的代码
class Solution {
    static boolean [][] vis;
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        vis = new boolean[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(board[i][j] == word.charAt(0) && DFS(i,j,board,word,0))
                        return true;
            }
        }
        return false;
    }
    
    public boolean DFS(int i, int j, char[][] board, String word, int t){
        int m = board.length, n = board[0].length;
        if(t == word.length())
            return true;
        if(i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || board[i][j] != word.charAt(t))
            return false;
        vis[i][j] = true;
        if(DFS(i + 1,j, board, word, ++t) || DFS(i - 1,j, board, word, ++t) || DFS(i,j + 1, board, word, ++t) 
           || DFS(i,j - 1, board, word, ++t) )
            return true;
        vis[i][j] = false;
        return false;
    }
}
