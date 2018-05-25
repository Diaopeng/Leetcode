public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
    List<String> res = new ArrayList<String>();
    TrieNode root = buildTree(words);
    for(int i = 0;i < board.length;i++){
        for(int j = 0;j < board[0].length;j++){
            dfs(board, root, i,j, res);
        }
    }
    return res;
}
public void dfs(char[][] board, TrieNode root, int i, int j, List<String> res){
    if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '#') return;
    char ch = board[i][j];
    if (root.child[ch-'a'] == null) return;
    board[i][j] = '#';
    root = root.child[ch-'a'];
    if(root.word != ""){
        res.add(root.word);
        root.word = "";  //一定要注意爸word加入之后清空，否组可能会导致word重复出现
    }
    dfs(board, root, i+1, j, res);
    dfs(board, root, i-1, j, res);
    dfs(board, root, i, j+1, res);
    dfs(board, root, i, j-1, res);
    board[i][j] = ch;
    
} 
    
public TrieNode buildTree(String[] words){
    TrieNode root = new TrieNode();
    for(String word: words){
        TrieNode cur = root;    //一定要注意这个位置的cur在这个位置，循环外会使的树建立的不对
        for(int i = 0;i < word.length();i++){
            int pos = word.charAt(i) - 'a';
            if(cur.child[pos] == null)
                cur.child[pos] = new TrieNode();
            cur = cur.child[pos];
        }
        cur.word = word;
    }
    return root;
}
}

class TrieNode{
String word;
TrieNode[] child;
TrieNode(){
    word = "";
    child = new TrieNode[26];
}
}