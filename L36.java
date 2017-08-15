// 使用hashset去检索横行，纵行，还有3 × 3方格内是否符合要求
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        for(int i = 0;i < m; i++){
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for(int j = 0;j < m;j++){
                if(board[i][j] != '.'&& !row.add(board[i][j]))
                   return false;
                if(board[j][i] != '.' &&  !col.add(board[j][i]))
                    return false;
                int x = i / 3 * 3 + j/3, y = j % 3 + i % 3 *3;
                if(board[x][y] != '.' && !cube.add(board[x][y]))
                    return false;
            }
        }
        return true;
    }
}
