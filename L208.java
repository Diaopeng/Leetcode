 
// 参考了网上的很多资料 Trie Tree
class TrieNode{
    char ch;
    boolean isWord;
    TrieNode [] child = new TrieNode[26];
    TrieNode(char c){
        ch = c;
    }
    TrieNode(){}
    
}

public class Trie {
    
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
        root.ch = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ws = root;
        char [] chararray = word.toCharArray();
        for(char c : chararray){
            if(ws.child[c - 'a'] == null )
                ws.child[c - 'a'] = new TrieNode(c);
            ws = ws.child[c - 'a'];
        }
        ws.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ws = root;
        char [] chararray = word.toCharArray();
        for(char c : chararray){
            if(ws.child[c - 'a'] == null)
                return false;
            ws = ws.child[c - 'a'];
        }
        return ws.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        char [] chararray = prefix.toCharArray();
        for(char c : chararray){
            if(ws.child[c - 'a'] == null)
                return false;
            ws = ws.child[c - 'a'];
        }
        return true;
    }
}
