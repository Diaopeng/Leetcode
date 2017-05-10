/*
这个题目比较简单，就是一般的string的题目，但是要注意的是，string在Java中是不可以更改的，所以必须转换成
StringBuffer或者charArray的，这样才可以进行更改

*/




public class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer temp = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for(int i = 0;i < s.length();){
            int j1 = Math.min(i+k,s.length());
            temp.append(s.substring(i,j1));
            temp.reverse();
            result.append(temp);
            int j2 = Math.min(i+2*k,s.length());
            result.append(s.substring(j1,j2));
            temp.delete(0,j1);
            i += 2*k;
        }
        return result.toString();
    }
}