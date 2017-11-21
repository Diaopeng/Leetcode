class Solution {
    int [][] dis;
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        dis = new int[l1][l2];
        for(int i = 0;i < l1;i++)  
            Arrays.fill(dis[i], -1);
        
        return getDistance(word1, word2, l1,l2);
    }
    public int getDistance(String word1, String word2, int l1, int l2){
        if(l1 == 0) return l2;
        if(l2 == 0) return l1;
        if(dis[l1 - 1][l2 - 1] >= 0) return dis[l1 - 1][l2 - 1];
        
        int result;
        
        if(word1.charAt(l1 -1) == word2.charAt(l2 -1)){
            result = getDistance(word1, word2,l1 -1, l2 - 1);
        }
        else{
            result = 1 + Math.min(getDistance(word1,word2,l1 - 1,l2 - 1), Math.min(getDistance(word1,word2, l1 -1, l2), getDistance(word1,word2,l1, l2 -1)));
        }
        dis[l1 - 1][l2 - 1] = result;
        return dis[l1 -1 ][l2 - 1];
        
    }
}
